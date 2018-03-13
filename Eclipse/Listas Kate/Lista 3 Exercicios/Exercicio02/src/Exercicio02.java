/*
 * 		Exercicio 02
 *	Autor: Luiz Fernando (Luizfcneto)
 *	Email: Luizfcneto123@gmail.com
 *	Descrição: receber 10 numeros e mostrar a quantidade de numeros
 *	 entre 30 e 90 
 *	Entrada: 10 numeros (int)
 *	Saida: quantidade de numeros entre 30 e 90 (int)
 * 
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int[] numbers = new int[10];
		int counterFor = 0, counterNumbers = 0;
		
		System.out.println("Informe 10 numeros: ");
		for (;counterFor < numbers.length; counterFor++) {
			numbers[counterFor] = scan.nextInt();
			
			if (numbers[counterFor] >= 30 && numbers[counterFor] <= 90) {
				counterNumbers += 1;
			}
		}
		
		System.out.println(counterNumbers);
		
	}
	
}
