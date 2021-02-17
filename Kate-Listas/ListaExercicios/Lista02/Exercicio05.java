package Lista02;
/*
 * 		Exercicio05
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: Ler 3 numeros e imprimi-los em ordem crescente
 * 	Entrada: 3 numeros (int)
 * 	Saida: 3 numeros (int) em ordem crescente
 * 
 */

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2, number3;
		System.out.println("Informe 3 numeros :");
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		number3 = scan.nextInt();
		
		if ( number1 <= number2 && number1 <= number3) {
			if (number2 <= number3)
				System.out.println(number1 + " < " + number2 + " < " + number3);
			else 
				System.out.println(number1 + " < " + number3 + " < " + number2);
		} else if (number2 <= number1 && number2 <= number3) {
			if ( number1 <= number3 )
				System.out.println(number2 + " < " + number1 + " < " + number3);
			else 
				System.out.println(number2 + " < " + number3 + " < " + number1);
		} else if ( number3 <= number1 && number3 <= number2 ) {
			if ( number1 <= number2) 
				System.out.println(number3 + " < " + number1 + " < " + number2);
			else 
				System.out.println(number3 + " < " + number2 + " < " + number1);
		}
		scan.close();
		
	}	
	
	
	
}
