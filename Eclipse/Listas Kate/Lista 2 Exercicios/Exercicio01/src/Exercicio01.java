/*
 * 		Exercicio 01
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: Verificar se o usuario é maior de idade
 * 	Entrada: Idade (int)
 * 	Saida: String resposta
 * 
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		System.out.println("Informe sua idade: ");
		age = scan.nextInt();
		if (age < 18 && age >= 0)
			System.out.println("Menor");
		else if (age < 0)
			System.out.println("Inexistente!");
		else {
			System.out.println("Maior");
		}
	} 
	
}
