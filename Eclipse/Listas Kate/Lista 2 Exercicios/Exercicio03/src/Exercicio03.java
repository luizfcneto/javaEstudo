/*
 * 		Exercicio 03
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Ler dois numeros do usuario e veif (rificar
 * 	 se o primeiro é divisivel pelo segundo
 * 	Entrada: 2 numeros (int)
 * 	Saida: divisivel ou nao (String)
 * 
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		System.out.println("Informe 2 numeros: ");
		number1 = scan.nextInt();
		number2 = scan.nextInt();		
		
		if (number1 % number2 == 0)
			System.out.println(number1 + " é divisivel por: " + number2);
		else 
			System.out.println(number1 + " não é divisivel por: " + number2);
	} 
	
}
