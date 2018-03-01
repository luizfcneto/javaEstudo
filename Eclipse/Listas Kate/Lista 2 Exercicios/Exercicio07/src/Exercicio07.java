/*
 * 		Exercicio07
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: Ler 2 notas de um Aluno e calcular 
 *   quanto ele precisa tirar na terceira para ser 
 *   aprovado, de acordo com a formula dada na questao 
 *   para calcular a media
 * 	Entrada: 2 notas (double)
 * 	Saida: 1 nota para ser aprovado (double)
 * 
 */

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double grade1, grade2, grade3;
		
		
		System.out.println("Informe as duas primeiras notas do aluno: ");
		grade1 = scan.nextDouble();
		grade2 = scan.nextDouble();
		grade3 = (5 - (grade1+grade2)/4)*2 ;
		System.out.println(grade3);
	}
	
}
