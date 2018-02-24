/*
 * 		Exercicio 04
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: ler do usuario dois numeros e retornar seu produto
 * 	Entrada: 2 numeros (int)
 * 	Saida: produto 1 (int)
 *
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2, result;
		System.out.println("Informe dois numeros:");
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		
		System.out.println(number1 * number2);
	}
	
}
