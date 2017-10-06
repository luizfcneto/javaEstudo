/*
 * Exercicio 6
 * Autor: luizfcneto
 * Email: luizfcneto123@gmail.com
 * 
 * Descricao: Ler um raio de uma circunferencia dado e calcular sua area
 * Entrada: raio da circunferencia
 * Saida: Área do circulo desse raio
 */

import java.util.Scanner;

public class Exercicio6 {
	
	
	//final = #define em C , declaracao de variavel constante
	public static final double pi = 3.1415;
	
	public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);
		double raio, area;
		
		
		System.out.println("Digite o valor do raio da circunferencia(m): ");
		raio = entrada.nextDouble();
		area = calcularArea(raio);
		System.out.println(area + " m² aproximadamente");
		
	}
	
	public static double calcularArea(double raio) {
		return pi*raio*raio;
	}
	
}
