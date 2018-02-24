/*
 * 		Exercicio 06
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: ler 3 numeros do usuario, exibir a soma
 *   do primeiro com o segundo, multiplicado pela soma do 
 *   segundo com o terceiro
 * 	Entrada: 3 numeros (double)
 * 	Saida: 1 numero (double)
 * 
 */

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double number1, number2, number3;
		System.out.println("Informe 3 numeros:");
		number1 = scan.nextDouble();
		number2 = scan.nextDouble();
		number3 = scan.nextDouble();
		
		System.out.println((number1 + number2)*(number2+number3));
	}

}
