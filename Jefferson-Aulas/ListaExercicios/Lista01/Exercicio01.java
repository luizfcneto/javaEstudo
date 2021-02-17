package Lista01;
/*
 * 		Exercicio01
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descricao: Determinar se um numero inteiro Ã© primo;
 * 	Entrada: numero (int) -> number;
 * 	Saida: Numero primo ou nao (boolean) -> prime; 
 * 
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main( String[] args ) {
		Scanner scan = new Scanner( System.in );
		int number, counter = 3;
		boolean prime = true;
		
		System.out.println( "Informe o numero: " );
		number = scan.nextInt();
		
		if( number == 1 || number == 2 ) 
			prime = true;
		
		else if( number % 2 == 0 )
			prime = false;
		
		else {
			while ( counter != number ) {
				if ( number % counter == 0 ) {
					prime = false;
					break;
				} 
				
				counter += 2;
			}			
		}
		
		System.out.println("O numero: " + number + " é primo? " + prime );
		scan.close();
	}
	
}
