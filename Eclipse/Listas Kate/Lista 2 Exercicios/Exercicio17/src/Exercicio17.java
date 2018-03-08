/*
 * 		Exercicio 17
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Escrever um programa para receber a idade
 *   de um nadador e retornar a sua categoria de acordo
 *   com a tabela descrita na questão
 * 	Entrada: Idade (int)
 * 	Saida: Categoria (String)
 *  
 */

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		System.out.println("Informe a idade do nadador:");
		age = scan.nextInt();
		if (age > 4 && age < 8) {
			System.out.println("Infantil A");
		}else if ( age > 7 && age < 11) {
			System.out.println("Infantil B");
		}else if ( age > 10 && age < 14) {
			System.out.println("Juvenil A");
		}else if ( age > 13 && age < 18) {
			System.out.println("Juvenil B");
		}else if ( age >= 18 ) {
			System.out.println("Sênior");
		}else {
			System.out.println("Inválido!");
		}
	
	}
	
}
