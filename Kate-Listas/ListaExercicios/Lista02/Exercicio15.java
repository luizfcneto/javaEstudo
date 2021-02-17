package Lista02;
/*
 *		Exercicio 15
 *	Autor: Luiz Fernando (Luizfcneto) 
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Receber o salario bruto de um funcionario
 *   e o valor da prestação. Eles receberao uma linha de 
 *   credito e o valor maximo da prestação tem que 
 *   ser 30% do valor bruto de seu salario 
 * 	Entrada: Salario Bruto (double), 
 *   valor da prestação (double)
 * 	Saida: Emprestimo aceito ou nao (boolean)
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double grossSalary, provision;
		boolean allowed = false;
		System.out.println("Informe o seu salario bruto e o valor da prestação, respectivamente: ");
		grossSalary = scan.nextDouble();
		provision = scan.nextDouble();
		if (provision <= grossSalary*0.3 && provision > 0) {
			allowed = true;
		}
		System.out.println(allowed);
		scan.close();
	}	
}
