package Lista02;
/*
 * 		Exercicio04
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: Ler 3 numeros e imprimir o maior entre eles
 * 	Entrada: 3 numeros (int)
 * 	Saida: o maior numero (int)
 * 
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2, number3;
		System.out.println("Informe 3 numeros: ");
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		number3 = scan.nextInt();
		
		if (number1 >= number2 && number1 >= number3)
			System.out.println(number1);		
		else if (number2 >= number1 && number2> number3) 
			System.out.println(number2);
		else 
			System.out.println(number3);
	
		scan.close();
	}
	
}
