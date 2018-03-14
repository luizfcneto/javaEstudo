/*
 * 		Exercicio 05
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: Leia um numero inteiro, positivo e 
 * 	 calcule seu fatorial
 * 	Entrada: numero (int)
 * 	Saida: numero ! (fatorial) (int)
 * 
 */

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int number, factorialNumber = 1;
		
		System.out.println("Informe um numero:");
		number = scan.nextInt();
		
		for (; number > 0; number--) {
			factorialNumber = number * factorialNumber;
		}
		System.out.println(factorialNumber);
	}
	
}
