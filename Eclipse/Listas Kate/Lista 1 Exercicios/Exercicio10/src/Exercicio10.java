/*
 * 		Exercicio 10
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Considerando que um sistema é 
 *   desenvolvido em 5 etapas, solicitar o valor e o
 *   tempo de desenvolvimento das 5 etapas e 
 *   calcular o custo total de desenvolvimento e 
 *   tempo pra conclusao
 * 	Entrada: 5 tempos (double), 5 custos (double)
 * 	Saida: 1 custo total (double), 1 tempo total (double)
 * 
 */

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		double[] time = new double[5];
		double[] cost = new double[5];
		double totalTime = 0, totalCost = 0;
		
		for (;i < time.length; i++) {
			System.out.println("Informe o tempo e o custo de desenvolvimento da etapa "+(i+1));
			time[i] = scan.nextDouble();
			cost[i] = scan.nextDouble();
			
			totalTime = time[i] + totalTime; 
			totalCost = cost[i] + totalCost;
		}
		System.out.println("Tempo total e custo: "+totalTime+" , "+totalCost);
		
	}
	
}
