package Lista06;
/*
 * 		Exercicio01
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: Ler 3 notas de um aluno e calcular sua
 * 	 média
 * 	Entrada: 3 Notas (double)
 * 	Saida: Média (double) 
 * 
 */

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double grade1, grade2, grade3;
		double average;
		System.out.println("Informe as 3 notas do aluno:");
		grade1 = scan.nextDouble();
		grade2 = scan.nextDouble();
		grade3 = scan.nextDouble();
		
		average = (grade1+grade2+grade3)/3;
		System.out.println("Notas: "+ grade1 + " , " + grade2 + " , " + grade3 + " Média: " + average);
		scan.close();
	} 
	
}
