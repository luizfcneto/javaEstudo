/*
 * 		Exercicio 05
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: Ler dois numeros e verificar se 
 *   o primeiro é divisivel pelo segundo
 * 	Entrada: 2 inteiros (int)
 * 	Saida: é divisivel, ou não 
 * 
 */

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		System.out.println("Informe dois numeros:");
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		
		if(number1 % number2 == 0)
			System.out.println("É divisivel");
		else
			System.out.println("Não é divisivel");
	
	}
	
}
