package Lista01;
/*
 * 		Exercicio 07
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição:Ler nota de 5 alunos e imprimir a 
 *  media dessas notas
 * 	Entrada: 5 notas (double) 
 *	Saida: 1 média das notas (double)
 * 
 */

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double grade1, grade2, grade3, grade4, grade5 ;
		double average;
		System.out.println("Informe 5 notas:");
		grade1 = scan.nextDouble();
		grade2 = scan.nextDouble();
		grade3 = scan.nextDouble();
		grade4 = scan.nextDouble();
		grade5 = scan.nextDouble();
		average = (grade1 + grade2 + grade3 + grade4 + grade5 )/5;
		System.out.println(average);
		scan.close();
	}
	
}
