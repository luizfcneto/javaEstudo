/*
 *		Exercicio08
 *	Autor: Luiz Fernando (Luizfcneto)
 *	Email: Luizfcneto123@gmail.com
 *	Descrição: Informar classe eleitoral de uma pessoa de acordo com a idade
 *	 abaixo de 16 	-> não eleitor
 *	 entre 18 e 65 	-> eleitor obrigatorio 
 * 	 entre 16 e 18 e acima de 65 -> eleitor facultativo
 *   
 *  Entrada: Idade (int)
 *  Saida: Classificacao (String)
 */

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		do {
			System.out.println("Informe sua idade: ");
			age = scan.nextInt();
		
			if (age < 16) {
				System.out.println("Não eleitor");			
			}else if (age >= 18 && age <=65) {
				System.out.println("Eleitor Obrigatorio");
			}else {
				System.out.println("Eleitor Facultativo");
			}
			
		}while(age != -1);
	}
	
}
