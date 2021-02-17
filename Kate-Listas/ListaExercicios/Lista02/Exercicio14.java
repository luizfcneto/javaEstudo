package Lista02;
/*
 *		Exercicio 14
 *	Autor: Luiz Fernando (Luizfcneto)
 *	Email: Luizfcneto123@gmail.com
 *	Descrição: Ler 3 numeros, imprimir a soma dos dois
 *	 maiores e a subtração dos dois menores
 *	Entrada: 3 numeros (int)
 *	Saida: soma dos dois maiores (int), subtração dos
 *   dois menores (int)
 * 
 */

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2, number3, sum, subtraction, bigger, smaller, middle;
		System.out.println("Informe 3 numeros:");
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		number3 = scan.nextInt();
		
		bigger = number1;
		smaller = number1;
		middle = number1;
		
		if (number2 > bigger) {
			middle = bigger;
			bigger = number2;
		} 
		if (number3 > bigger) {
			middle = bigger;
			bigger = number3;
		}
		if (bigger == number1) {
			if (number2 > number3) {
				middle = number2;
				smaller = number3;
		
			}else {
				middle = number3;
				smaller = number2;
			}
		}
		
		if (smaller > number2) {
			smaller = number2;
		}
		if (smaller > number3) {
			smaller = number3;
		}
		sum = bigger + middle;
		subtraction = middle - smaller;
		
		System.out.println("Soma:"+sum+ " subtração: "+ subtraction);
		scan.close();
	}
	
}
