/*
 * 		Exercicio 04
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: luizfcneto123@gmail.com
 * 	Descrição: Ler dois numeros inteiros e verificar
 * 	 se ambos são iguais
 * 	Entrada: 2 inteiros (int)
 * 	Saida: Iguais ou diferentes
 * 
 */

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		System.out.println("Informe dois numeros: ");
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		if(number1 == number2)
			System.out.println("iguais");
		else
			System.out.println("Diferentes");
	}
	
	
}
