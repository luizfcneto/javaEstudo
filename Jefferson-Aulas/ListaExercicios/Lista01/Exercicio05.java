package Lista01;
/*
 * 		Exercicio 05
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Calcular a media e o desvio padrão de uma lista de numeros
 * 	Entrada: n numeros (double) -> numbers
 *  Saida: media (double) -> average
 *   	, desvio padrão (double) -> standartDeviation
 * 
 */

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main( String[] args ) {
		Scanner scan = new Scanner( System.in );
		double average = 1, standartDeviation = 0;
		int counter, size;
		
		System.out.println( "Informe a quantidade de numeros que irá inserir: ");
		size = scan.nextInt();
		double[] numbers = new double[size];
		
		for ( counter = 0; counter < size; counter++ ) {
			System.out.println("Informe o numero[" + ( counter + 1 ) + "]: " );
			numbers[counter] = scan.nextDouble();
			
			average += numbers[counter];
		}
		average = average / size;
		
		for ( counter = 0; counter < size ; counter++ ) 
			standartDeviation = Math.pow( ( numbers[counter] - average ) , 2 ) + standartDeviation;
		
		standartDeviation = standartDeviation / ( counter - 1) ;
		System.out.println( "Media: " + average + " Desvio Padrão: " + standartDeviation + " contador: " + counter );
		scan.close();
	}

}
