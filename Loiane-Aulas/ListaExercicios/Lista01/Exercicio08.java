package Lista01;
/*
 * Exercicio 8
 * Autor: luizfcneto
 * Email: luizfcneto123@gmail.com
 * 
 * Descricao: Criar um programa que a partir da quantidade de horas que um trabalhador trabalha (no mês) e quanto ele recebe por hora calcular o salario.
 * Entrada: quantidade de horas e quanto recebe por hora 
 * Saida: Salario
 * 
 */

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int horas;
		double salarioHora, salario;
		
		System.out.println("Informe a quantidade de horas trabalhadas(no mês) e quanto recebe por hora respectivamente: ");
		horas = entrada.nextInt();
		salarioHora = entrada.nextDouble();
		salario = calculaSalario(horas,salarioHora);
		System.out.println("Salario mensal de: "+salario+ " reais.");
		entrada.close();
	}
	
	public static double calculaSalario (int horas, double salarioHora) {
		return horas*salarioHora;
	}
	
}
