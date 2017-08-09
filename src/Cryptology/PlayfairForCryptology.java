package Cryptology;

public class PlayfairForCryptology {
	public static void doSecondaryMatrix()
	{
		char letters[][] = Cryptology1.GeneratedMatrix.getLetters();
		
		for(int i=0;i<25;++i)
			Cryptology1.pfCustMatrix[i].setText(String.valueOf(letters[i/5][i%5]));
	}
	
	// Ну опять же создает матрицу 5 на 5
	public static void doGenerate()
	{
		int i,j;
		
		char ref[] = { 'A','B','C','D','E','F','G','H','I','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		String keyword = Cryptology1.EnterKeywordToGenerateMatrixTextBox.getText();
		keyword = keyword.replace('J','I');
		keyword = keyword.replace('j','i');
		
		char letters[] = new char[25];
		
		// Тут происходит магия и символы из строки, добавляются в матрицу.
		// Так причем происходит так, что они в матрице не повторяются.
		for(i=0,j=0;i<keyword.length();++i)
			if(String.valueOf(letters).indexOf(keyword.charAt(i)) == -1)
				letters[j++] = keyword.charAt(i);
		
		String newKeyword = new String(letters,0,j);
		
		// Переводим в заглавный шрифт
		newKeyword = newKeyword.toUpperCase();
                
		for(i=0;i<25;++i)
		{
			if(newKeyword.indexOf(ref[i]) == -1)
			{
				letters[j++] = ref[i];
			}
		}
		
		String strLetters = new String(letters);
		
		strLetters = strLetters.toUpperCase();
		
		// Переводим с рисованной матрицы в матрицу char`ов
		Cryptology1.GeneratedMatrix.setLetters(strLetters.toCharArray());
	}
	
	// Тутачки пошел процесс шифрования
	public static void doEncrypt()
	{
		String plaintext = Cryptology1.jFormattedTextField1.getText();
		
		// Шифрование согласно правилам PlainFair
		plaintext = ppPlainText(plaintext);
		
		// Переводим в верхний регистр
		plaintext = plaintext.toUpperCase();
		
		String ciphertext = "";
		
		for(int i=0;i<plaintext.length();i+=2)
		{
			ciphertext = ciphertext.concat(decode(Cryptology1.GeneratedMatrix.getLetters(), plaintext.charAt(i), plaintext.charAt(i+1), true));
                       
		}
		
		// Выводим все это на экран
		Cryptology1.EncryptedTextTextField.setText(ciphertext);
                
	}
	
	public static void doDecrypt(){
                try{
	{doSecondaryMatrix();
		String ciphertext = Cryptology1.EncryptedTextTextField.getText();
		
		ciphertext = ciphertext.toUpperCase();
		
		String plaintext = "";
		
		char letters[][] = new char[5][5];
		
		for(int i=0;i<25;++i)
		{
			// Тут вырисовывается вторая матрица, от которой я так и не смог избавится
			if(Cryptology1.pfCustMatrix[i].getText().equals(""))
				letters[i/5][i%5] = '-';
			else
				letters[i/5][i%5] = Cryptology1.pfCustMatrix[i].getText().charAt(0);
		}		
		
		for(int i=0;i<ciphertext.length();i+=2)
		{
			// Вот это вот и есть тот самый процесс ДЕКОДИРОВАНИЯ
			plaintext = plaintext.concat(decode(letters, ciphertext.charAt(i), ciphertext.charAt(i+1), false));
		}
		
		// Показываем то что дешифровали
		Cryptology1.DecryptedTextTextBox.setText(plaintext);		
        }}
        catch (StringIndexOutOfBoundsException e){
 new Preduprezhdenye().setVisible(true);
}
        }  
	public static String ppPlainText(String plaintext)
	{
		String newPlaintext = "";
		
		for(int i=0;i<plaintext.length();++i)
		{
			// если char j, то добавляем i в plaintext
			if(plaintext.charAt(i) == 'j')
				newPlaintext = newPlaintext.concat("i");
			// Если нам в паре нехватает сиволов, то мы добавляем Х
			else if((i != (plaintext.length()-1)) && plaintext.charAt(i) == plaintext.charAt(i+1))
			{
				String conversion = String.valueOf(plaintext.charAt(i));
				conversion = conversion.concat("x");
				
				newPlaintext = newPlaintext.concat(conversion);
			}
			else
				newPlaintext = newPlaintext.concat(String.valueOf(plaintext.charAt(i)));			
		}
		
		// проверяем парность, и если она нефига не 2, то добавляем Х
		if(newPlaintext.length()%2!=0)
			newPlaintext = newPlaintext.concat(String.valueOf("x"));
		
		return newPlaintext;
	}
	

	// Тут дешифрование происходит из массива, находящегося в форме
	public static String decode(char[][] matrix, char a, char b, boolean encrypt)
	{
		int row_a=-1, row_b=-1, col_a=-1, col_b=-1;
		int row_c, row_d, col_c, col_d;
		
		char result[] = new char[2];
		
		for(int i=0;i<5;++i)
		{
			for(int j=0;j<5;++j)
			{
				if(matrix[i][j] == a)
				{
					row_a = i;
					col_a = j;
				}
				
				if(matrix[i][j] == b)
				{
					row_b = i;
					col_b = j;
				}
			}
		}
		
		if((row_a == -1 && col_a == -1) ||
		   (row_b == -1 && col_b == -1))
		{
			result[0] = '-';
			result[1] = '-';
		}
		else
		{
			if(row_a == row_b)
			{
				row_c = row_a;
				col_c = (encrypt ? (col_a+1)%5 : (col_a == 0 ? 4 : (col_a-1)));
				row_d = row_b;
				col_d = (encrypt ? (col_b+1)%5 : (col_b == 0 ? 4 : (col_b-1)));
			}
	
			else if(col_a == col_b)
			{
				row_c = (encrypt ? (row_a+1)%5 : (row_a == 0 ? 4 : (row_a-1)));
				col_c = col_a;
				row_d = (encrypt ? (row_b+1)%5 : (row_b == 0 ? 4 : (row_b-1)));
				col_d = col_b;
			}
		
			else
			{
				row_c = row_a;
				col_c = col_b;
				row_d = row_b;
				col_d = col_a;
			}
			
			result[0] = matrix[row_c][col_c];
			result[1] = matrix[row_d][col_d];
		}
		
		return new String(result);
	}
}