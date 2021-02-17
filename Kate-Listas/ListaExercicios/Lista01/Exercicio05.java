package Lista01;
/*
 *		Exercicio 05 
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: Perguntar nome e idade do usuario, e imprimir 
 *   "Olá, <nome>, voce tem <idade> anos"
 *  Entrada: Nome (String), Idade(int)
 *  Saida: String
 * 
 */

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		
		System.out.println("Informe seu nome e idade: ");
		name = scan.nextLine();
		age = scan.nextInt();
	
		System.out.println("Ol�, "+name+" voce tem "+age+" anos.");
		scan.close();
	}
	
	
}
