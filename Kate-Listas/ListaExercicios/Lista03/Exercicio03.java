package Lista03;
/*
 *		Exercicio03
 *	Autor: Luiz Fernando (Luizfcneto)
 *	Email: Luizfcneto123@gmail.com	
 *	Descrição: Fazer um programa que verifique se um
 *   determinado numero é primo
 *	Entrada: numero (int)
 *	Saida: é ou não (boolean)
 * 
 */

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number, counter = 3, aux = 0;
		boolean prime = false;
		
		System.out.println("Informe o numero que deseja saber se é primo:");
		number = scan.nextInt();
		
		if ( number == 2 || number == 1 ) {
			System.out.println("É Primo");
		}else {
			
			while ( number >= counter) {
				if (number % counter == 0) {
					aux ++;
					if (aux >= 2) {
						prime = false;
						break;
					}else if (counter == number && aux == 1) {
						prime = true;
						break;
					}
				}
				counter += 2;
			}
			
			if (prime) {
				System.out.println(number + " É primo!");
			}else {
				System.out.println(number + " Não é primo!");
			}
		}
		scan.close();
	}
	
}
