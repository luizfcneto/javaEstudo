package Lista01;
/*
 * 		Exercicio 06
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Ordernar um array de numeros inteiros
 *  
 *  Entrada: quantidade do vetor (int) ->numbersQuantity, 
 *    	numeros (int[]) ->numbers
 *  
 *  Saida: vetor ordenado (int[qtdNumeros])
 * 
 */

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main( String[] args ) {
		Scanner scan = new Scanner( System.in );
		int numbersQuantity, counterI;
		
		System.out.println( "Informe o tamanho do vetor: " );
		numbersQuantity = scan.nextInt();
		
		int[] numbers = new int[ numbersQuantity ];
		
		for ( counterI = 0; counterI < numbersQuantity; counterI++ ) {
			System.out.println( "Informe o numero [" + ( counterI + 1 ) + "]:" );
			numbers[counterI] = scan.nextInt();
		}
		
		bubbleSort( numbersQuantity, numbers );
		printArray( numbersQuantity, numbers );
		scan.close();
	}
		
	public static void bubbleSort( int numbersQuantity, int[] numbers ) {	
		int counterI = 1, counterJ = 0, support; 
		boolean changes = true;
		
		while ( changes ) {
			changes = false;
			
			for ( counterI = 1; counterI < numbersQuantity; counterI++ ) {
				
				if ( numbers[counterJ] > numbers[counterI] ) {
					support = numbers[counterI];
					numbers[counterI] = numbers[counterJ];
					numbers[counterJ] = support;
					changes = true;
					
				}
				counterJ++;
			
			}
			counterJ = 0;
			
		}
		
	}
	
	public static void printArray( int numbersQuantity, int[] numbers ) {
		int counterI;
		
		for ( counterI = 0; counterI < numbersQuantity; counterI++ ) {
			System.out.println( "Posicao: [ " + ( counterI + 1 ) + " ]: " + " " + numbers[counterI]); 
		}
		
	}
	
}
