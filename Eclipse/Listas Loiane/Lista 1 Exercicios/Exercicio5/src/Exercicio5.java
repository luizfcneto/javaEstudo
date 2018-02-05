/*
 * Exercicio 5
 * Autor: luizfcneto
 * Email: luizfcneto123@gmail.com
 * 
 * Descrição: Converter entrada (em metros) para centimetros
 * Entrada: Numero double representando uma medida em metros
 * Saida: Numero double representando o mesmo tamanho que a entrada so que em centimetros
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double metros, centimetros;
		System.out.println("Informe a medida em metros: ");
		metros = entrada.nextDouble();
		centimetros = convert(metros);
		System.out.println(metros+ " m "+" = "+centimetros +" cm ");
	}
	
	public static double convert(double metros) {
		return metros*100;
	}

}
