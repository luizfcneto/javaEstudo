/*
 * Exercicio 10
 * Autor: luizfcneto
 * Email: luizfcneto123@gmail.com
 * 
 * Descrição: Converter temperatura em Graus Celcius para Farenheit
 * Entrada: temperatura em graus Celcius
 * Saida: temperatura convertida para Farenheit
 * 
 */

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double temperaturaCelcius, temperaturaFarenheit;
		
		System.out.println("Informe a temperatura em Graus Celcius: ");
		temperaturaCelcius = entrada.nextDouble();
		temperaturaFarenheit = convertCelciusToFarenheit(temperaturaCelcius);
		System.out.println("Celcius: "+ temperaturaCelcius + " = " + temperaturaFarenheit + " Farenheit, aproximadamente");
		
	}
	
	public static double convertCelciusToFarenheit(double temperaturaCelcius) {
		return (temperaturaCelcius*9/5) + 32;
	}

}
