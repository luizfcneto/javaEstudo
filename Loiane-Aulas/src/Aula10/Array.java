package Aula10;
/*
 * 	Aula 11 - Vetores / Arrays
 * 
 * 
 */

import java.util.Scanner;
public class Array {
	
	public static void main(String[] args) {
		
		/*
		 * Não podemos ter uma variavel para cada dia do ano
		 *  double tempDia0001 = 30;
		 *	double tempDia0002 = 31.2;
		 *	double tempDia0003 = 32.1;
		 *	double tempDia0004 = 40; 
		 */
		Scanner entrada = new Scanner(System.in);
		
		//inicializando o vetor
		double[] temperaturas = new double[365];
		
		temperaturas[0] = 30;
		temperaturas[1] = 31.2;
		temperaturas[2] = 32.1;
		temperaturas[3] = 40;
		
		System.out.println("primeiro dia:" + temperaturas[0]);
		
		//length	-> metodo da classe Array
		System.out.println("Tamanho do vetor: "+ temperaturas.length);
	
		//Imprimir Array todo
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("Temperatura: "+ temperaturas[i] + " dia: "+ (i+1));
		}
	
		//Enhanced For
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
	}
	
}
