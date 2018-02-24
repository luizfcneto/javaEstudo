/*
 * 		Exercicio 06
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: luizfcneto123@gmail.com
 * 	Descrição: Perguntar o raio de uma circunferencia,
 * 	 mostrar seu diametro, comprimento e área
 *	Entrada: Raio, ponto flutuante (double)
 *	Saida: Diametro, comprimento e a área
 * 
 */

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double radius, circumference, diameter, area;
		final double PI = 3.1415;
		System.out.println("Informe o raio da circunferencia");
		radius = scan.nextDouble();
		
		circumference = 2*PI*radius;
		diameter = 2*radius;
		area = PI*(radius*radius);
		System.out.println("Raio: " + radius + " Diametro: " + diameter + " Circunferencia: " + circumference + " Area: " + area);
	}
}
