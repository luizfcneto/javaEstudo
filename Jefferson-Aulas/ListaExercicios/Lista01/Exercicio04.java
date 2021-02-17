package Lista01;
/*
 *		Exercicio 04 
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: verificar se uma palavra é um palindromo
 * 	Entrada: palavra (String) -> word
 * 	Saida: é ou não (boolean) -> palindrome
 * 
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main( String[] args ) {
		Scanner scan = new Scanner ( System.in );
		String word;
		boolean palindrome;
		int equalLetters = 0;
		
		System.out.println( "Informe a palavra: " );
		word = scan.next();
		
		for ( int counter = 0; counter < word.length(); counter++ ) {
			if ( word.charAt( counter ) == word.charAt( ( word.length() - 1 ) - counter ) ) 
				equalLetters++;
		}
		
		if ( equalLetters == word.length() )
			palindrome = true;
		else 
			palindrome = false;
		
		System.out.println( "A palavra " + word + " é um palindromo? " + palindrome );
		scan.close();
	}
	
}
