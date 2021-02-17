package Lista02;
/*
 *		Exercicio02
 *	Autor: Luiz Fernando (Luizfcneto)
 *	Email: Luizfcneto123@gmail.com
 *	Descrição: Ler dois numeros do usuario e 
 *   informar qual é o maior
 *	Entrada: 2 numeros (int)
 *	Saida: Maior ou Menor (String)  
 * 
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		System.out.println("Informe dois numeros:");
		number1 = scan.nextInt();
		number2 = scan.nextInt();
		
		if (number1 >= number2)
			System.out.println(number1 + " é Maior ");
		else 
			System.out.println(number2 + " é Maior ");
		
		scan.close();
	}
}
