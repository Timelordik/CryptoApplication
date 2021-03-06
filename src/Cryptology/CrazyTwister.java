package Cryptology;

import java.io.*;


public strictfp class CrazyTwister extends java.util.Random implements
		Serializable, Cloneable {
	// Serialization
	private static final long serialVersionUID = -4035832775130174188L;
																		

	// Period parameters
	private static final int N = 624;
	private static final int M = 397;
	private static final int MATRIX_A = 0x9908b0df; 													
	private static final int UPPER_MASK = 0x80000000;
														
	private static final int LOWER_MASK = 0x7fffffff;
														

	// Tempering parameters
	private static final int TEMPERING_MASK_B = 0x9d2c5680;
	private static final int TEMPERING_MASK_C = 0xefc60000;

	private int mt[]; // the array for the state vector
	private int mti; // mti==N+1 means mt[N] is not initialized
	private int mag01[];

	private double __nextNextGaussian;
	private boolean __haveNextNextGaussian;

	public Object clone() {
		try {
			CrazyTwister f = (CrazyTwister) (super.clone());
			f.mt = (int[]) (mt.clone());
			f.mag01 = (int[]) (mag01.clone());
			return f;
		} catch (CloneNotSupportedException e) {
			throw new InternalError();
		} // should never happen
	}

	public boolean stateEquals(Object o) {
		if (o == this)
			return true;
		if (o == null || !(o instanceof CrazyTwister))
			return false;
		CrazyTwister other = (CrazyTwister) o;
		if (mti != other.mti)
			return false;
		for (int x = 0; x < mag01.length; x++)
			if (mag01[x] != other.mag01[x])
				return false;
		for (int x = 0; x < mt.length; x++)
			if (mt[x] != other.mt[x])
				return false;
		return true;
	}

	/** Reads the entire state of the CrazyTwister RNG from the stream */
	public void readState(DataInputStream stream) throws IOException {
		int len = mt.length;
		for (int x = 0; x < len; x++)
			mt[x] = stream.readInt();

		len = mag01.length;
		for (int x = 0; x < len; x++)
			mag01[x] = stream.readInt();

		mti = stream.readInt();
		__nextNextGaussian = stream.readDouble();
		__haveNextNextGaussian = stream.readBoolean();
	}

	/** Writes the entire state of the CrazyTwister RNG to the stream */
	public void writeState(DataOutputStream stream) throws IOException {
		int len = mt.length;
		for (int x = 0; x < len; x++)
			stream.writeInt(mt[x]);

		len = mag01.length;
		for (int x = 0; x < len; x++)
			stream.writeInt(mag01[x]);

		stream.writeInt(mti);
		stream.writeDouble(__nextNextGaussian);
		stream.writeBoolean(__haveNextNextGaussian);
	}

	/**
	 * Constructor using the default seed.
	 */
	public CrazyTwister() {
		this(System.currentTimeMillis());
	}

	public CrazyTwister(final long seed) {
		super(seed); /* just in case */
		setSeed(seed);
	}

	public CrazyTwister(final int[] array) {
		super(System.currentTimeMillis()); 										
		setSeed(array);
	}

	synchronized public void setSeed(final long seed) {
		super.setSeed(seed);

		__haveNextNextGaussian = false;

		mt = new int[N];

		mag01 = new int[2];
		mag01[0] = 0x0;
		mag01[1] = MATRIX_A;

		mt[0] = (int) (seed & 0xffffffff);
		for (mti = 1; mti < N; mti++) {
			mt[mti] = (1812433253 * (mt[mti - 1] ^ (mt[mti - 1] >>> 30)) + mti);
			mt[mti] &= 0xffffffff;
		}
	}

	synchronized public void setSeed(final int[] array) {
		if (array.length == 0)
			throw new IllegalArgumentException(
					"Array  length  must  be  greater  than  zero");
		int i, j, k;
		setSeed(19650218);
		i = 1;
		j = 0;
		k = (N > array.length ? N : array.length);
		for (; k != 0; k--) {
			mt[i] = (mt[i] ^ ((mt[i - 1] ^ (mt[i - 1] >>> 30)) * 1664525))
					+ array[j] + j; /* non linear */
			mt[i] &= 0xffffffff; /* for WORDSIZE > 32 machines */
			i++;
			j++;
			if (i >= N) {
				mt[0] = mt[N - 1];
				i = 1;
			}
			if (j >= array.length)
				j = 0;
		}
		for (k = N - 1; k != 0; k--) {
			mt[i] = (mt[i] ^ ((mt[i - 1] ^ (mt[i - 1] >>> 30)) * 1566083941))
					- i; 
			mt[i] &= 0xffffffff; 
			i++;
			if (i >= N) {
				mt[0] = mt[N - 1];
				i = 1;
			}
		}
		mt[0] = 0x80000000; 
	}
        
	synchronized protected int next(final int bits) {
		int y;

		if (mti >= N) // generate N words at one time
		{
			int kk;
			final int[] mt = this.mt; // locals are slightly faster
			final int[] mag01 = this.mag01; // locals are slightly faster

			for (kk = 0; kk < N - M; kk++) {
				y = (mt[kk] & UPPER_MASK) | (mt[kk + 1] & LOWER_MASK);
				mt[kk] = mt[kk + M] ^ (y >>> 1) ^ mag01[y & 0x1];
			}
			for (; kk < N - 1; kk++) {
				y = (mt[kk] & UPPER_MASK) | (mt[kk + 1] & LOWER_MASK);
				mt[kk] = mt[kk + (M - N)] ^ (y >>> 1) ^ mag01[y & 0x1];
			}
			y = (mt[N - 1] & UPPER_MASK) | (mt[0] & LOWER_MASK);
			mt[N - 1] = mt[M - 1] ^ (y >>> 1) ^ mag01[y & 0x1];

			mti = 0;
		}

		y = mt[mti++];
		y ^= y >>> 11;
		y ^= (y << 7) & TEMPERING_MASK_B;
		y ^= (y << 15) & TEMPERING_MASK_C; 
		y ^= (y >>> 18);

		return y >>> (32 - bits); // hope that's right!
	}

	private synchronized void writeObject(final ObjectOutputStream out)
			throws IOException {
		// just so we're synchronized.
		out.defaultWriteObject();
	}

	private synchronized void readObject(final ObjectInputStream in)
			throws IOException, ClassNotFoundException {
		// just so we're synchronized.
		in.defaultReadObject();
	}

	public boolean nextBoolean() {
		return next(1) != 0;
	}

	public boolean nextBoolean(final float probability) {
		if (probability < 0.0f || probability > 1.0f)
			throw new IllegalArgumentException(
					"probability  must  be  between  0.0  and  1.0  inclusive.");
		if (probability == 0.0f)
			return false; // fix half-open issues
		else if (probability == 1.0f)
			return true; // fix half-open issues
		return nextFloat() < probability;
	}

	/**
	 * This generates a coin flip with a probability <tt>probability</tt> of
	 * returning true else returning false. <tt>probability</tt> must be between
	 * 0.0 and 1.0 inclusive.
	 */

	public boolean nextBoolean(final double probability) {
		if (probability < 0.0 || probability > 1.0)
			throw new IllegalArgumentException(
					"probability  must  be  between  0.0  and  1.0  inclusive.");
		if (probability == 0.0)
			return false; // fix half-open issues
		else if (probability == 1.0)
			return true; // fix half-open issues
		return nextDouble() < probability;
	}

	public int nextInt(final int n) {
		if (n <= 0)
			throw new IllegalArgumentException("n  must  be  positive   got:  "
					+ n);

		if ((n & -n) == n)
			return (int) ((n * (long) next(31)) >> 31);

		int bits, val;
		do {
			bits = next(31);
			val = bits % n;
		} while (bits - val + (n - 1) < 0);
		return val;
	}

	public long nextLong(final long n) {
		if (n <= 0)
			throw new IllegalArgumentException("n  must  be  positive   got:  "
					+ n);

		long bits, val;
		do {
			bits = (nextLong() >>> 1);
			val = bits % n;
		} while (bits - val + (n - 1) < 0);
		return val;
	}

	public double nextDouble() {
		return (((long) next(26) << 27) + next(27)) / (double) (1L << 53);
	}

	public float nextFloat() {
		return next(24) / ((float) (1 << 24));
	}

	public void nextBytes(final byte[] bytes) {
		for (int x = 0; x < bytes.length; x++)
			bytes[x] = (byte) next(8);
	}

	public char nextChar() {
		// chars are 16-bit UniCode values
		return (char) (next(16));
	}

	public short nextShort() {
		return (short) (next(16));
	}

	public byte nextByte() {
		return (byte) (next(8));
	}

	synchronized public double nextGaussian() {
		if (__haveNextNextGaussian) {
			__haveNextNextGaussian = false;
			return __nextNextGaussian;
		} else {
			double v1, v2, s;
			do {
				v1 = 2 * nextDouble() - 1; // between -1.0 and 1.0
				v2 = 2 * nextDouble() - 1; // between -1.0 and 1.0
				s = v1 * v1 + v2 * v2;
			} while (s >= 1 || s == 0);
			double multiplier = StrictMath.sqrt(-2 * StrictMath.log(s) / s);
			__nextNextGaussian = v2 * multiplier;
			__haveNextNextGaussian = true;
			return v1 * multiplier;
		}
	}

	public static void main(String args[]) {
		int j;

		CrazyTwister r;

		r = new CrazyTwister(new int[] { 0x123, 0x234, 0x345, 0x456 });
		System.out
				.println("Output  of  CrazyTwister  with  new seeding  mechanism");
		for (j = 0; j < 1000; j++) {
			// first convert the int from signed to "unsigned"
			long l = (long) r.nextInt();
			if (l < 0)
				l += 4294967296L; // max int value
			String s = String.valueOf(l);
			while (s.length() < 10)
				s = "  " + s; // buffer
			System.out.print(s + "  ");
			if (j % 5 == 4)
				System.out.println();
		}

		// SPEED TEST

		final long SEED = 4357;

		int xx;
		long ms;
		System.out.println("\nTime  to  test  grabbing  100000000  ints");

		r = new CrazyTwister(SEED);
		ms = System.currentTimeMillis();
		xx = 0;
		for (j = 0; j < 100000000; j++)
			xx += r.nextInt();
		System.out.println("Crazy  Twister:  "
				+ (System.currentTimeMillis() - ms) + "  Ignore  this:  " + xx);

		System.out.println("To  compare  this  with  java.util.Random   run  this  same  test  on  MersenneTwisterFast.");
		System.out.println("The  comparison  with  Random  is  removed  from  CrazyTwister  because  it  is  a  proper");
		System.out.println("subclass  of  Random  and  this  unfairly  makes  some  of  Random's  methods  un-inlinable ");
		System.out.println("so  it  would  make  Random  look  worse  than  it  is.");


		System.out.println("\nGrab  the  first  1000  booleans");
		r = new CrazyTwister(SEED);
		for (j = 0; j < 1000; j++) {
			System.out.print(r.nextBoolean() + "  ");
			if (j % 8 == 7)
				System.out.println();
		}
		if (!(j % 8 == 7))
			System.out.println();

		System.out
				.println("\nGrab  1000  booleans  of  increasing  probability  using  nextBoolean(double)");
		r = new CrazyTwister(SEED);
		for (j = 0; j < 1000; j++) {
			System.out.print(r.nextBoolean((double) (j / 999.0)) + "  ");
			if (j % 8 == 7)
				System.out.println();
		}
		if (!(j % 8 == 7))
			System.out.println();

		System.out
				.println("\nGrab  1000  booleans  of  increasing  probability  using  nextBoolean(float)");
		r = new CrazyTwister(SEED);
		for (j = 0; j < 1000; j++) {
			System.out.print(r.nextBoolean((float) (j / 999.0f)) + "  ");
			if (j % 8 == 7)
				System.out.println();
		}
		if (!(j % 8 == 7))
			System.out.println();

		byte[] bytes = new byte[1000];
		System.out.println("\nGrab  the  first  1000  bytes  using  nextBytes");
		r = new CrazyTwister(SEED);
		r.nextBytes(bytes);
		for (j = 0; j < 1000; j++) {
			System.out.print(bytes[j] + "  ");
			if (j % 16 == 15)
				System.out.println();
		}
		if (!(j % 16 == 15))
			System.out.println();

		byte b;
		System.out
				.println("\nGrab  the  first  1000  bytes  --  must  be  same  as  nextBytes");
		r = new CrazyTwister(SEED);
		for (j = 0; j < 1000; j++) {
			System.out.print((b = r.nextByte()) + "  ");
			if (b != bytes[j])
				System.out.print("BAD  ");
			if (j % 16 == 15)
				System.out.println();
		}
		if (!(j % 16 == 15))
			System.out.println();

		System.out.println("\nGrab  the  first  1000  shorts");
		r = new CrazyTwister(SEED);
		for (j = 0; j < 1000; j++) {
			System.out.print(r.nextShort() + "  ");
			if (j % 8 == 7)
				System.out.println();
		}
		if (!(j % 8 == 7))
			System.out.println();

		System.out.println("\nGrab  the  first  1000  ints");
		r = new CrazyTwister(SEED);
		for (j = 0; j < 1000; j++) {
			System.out.print(r.nextInt() + "  ");
			if (j % 4 == 3)
				System.out.println();
		}
		if (!(j % 4 == 3))
			System.out.println();

		System.out
				.println("\nGrab  the  first  1000  ints  of  different  sizes");
		r = new CrazyTwister(SEED);
		int max = 1;
		for (j = 0; j < 1000; j++) {
			System.out.print(r.nextInt(max) + "  ");
			max *= 2;
			if (max <= 0)
				max = 1;
			if (j % 4 == 3)
				System.out.println();
		}
		if (!(j % 4 == 3))
			System.out.println();

		System.out.println("\nGrab  the  first  1000  longs");
		r = new CrazyTwister(SEED);
		for (j = 0; j < 1000; j++) {
			System.out.print(r.nextLong() + "  ");
			if (j % 3 == 2)
				System.out.println();
		}
		if (!(j % 3 == 2))
			System.out.println();

		System.out
				.println("\nGrab  the  first  1000  longs  of  different  sizes");
		r = new CrazyTwister(SEED);
		long max2 = 1;
		for (j = 0; j < 1000; j++) {
			System.out.print(r.nextLong(max2) + "  ");
			max2 *= 2;
			if (max2 <= 0)
				max2 = 1;
			if (j % 4 == 3)
				System.out.println();
		}
		if (!(j % 4 == 3))
			System.out.println();

		System.out.println("\nGrab  the  first  1000  floats");
		r = new CrazyTwister(SEED);
		for (j = 0; j < 1000; j++) {
			System.out.print(r.nextFloat() + "  ");
			if (j % 4 == 3)
				System.out.println();
		}
		if (!(j % 4 == 3))
			System.out.println();

		System.out.println("\nGrab  the  first  1000  doubles");
		r = new CrazyTwister(SEED);
		for (j = 0; j < 1000; j++) {
			System.out.print(r.nextDouble() + "  ");
			if (j % 3 == 2)
				System.out.println();
		}
		if (!(j % 3 == 2))
			System.out.println();

		System.out.println("\nGrab  the  first  1000  gaussian  doubles");
		r = new CrazyTwister(SEED);
		for (j = 0; j < 1000; j++) {
			System.out.print(r.nextGaussian() + "  ");
			if (j % 3 == 2)
				System.out.println();
		}
		if (!(j % 3 == 2))
			System.out.println();

	}

}
