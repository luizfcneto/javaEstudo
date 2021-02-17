package Lista06;
/*
 * 		Exercicio 03
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: Ler um numero do usuario e imprimir o
 * 	 dobro desse numero
 *	Entrada: 1 numero (int)
 * 	Saida: 1 numero (int)
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.println("Informe um numero:");
		number = scan.nextInt();
		System.out.println(number*2);
		scan.close();
	}
	
}
