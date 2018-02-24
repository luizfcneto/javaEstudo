/*
 * 		Exercicio07
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: Ler a idade de 10 pessoas e dizer se 
 *   podem doar sangue ou não (entre 18 e 67, podem)
 * 	Entrada: 10 numeros (int)
 * 	Saida: 10 boolean
 *   
 */

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] ages = new int[10];
		int i = 0;
		boolean approved;
		for (; i < ages.length; i++) {
			System.out.println("Informe a sua idade: ");
			ages[i] = scan.nextInt();
			
			if(ages[i] >= 18 && ages[i] <= 67) {
				approved = true;
			} else {
				approved = false;
			}
			System.out.println(approved);
		}
	}
	
}
