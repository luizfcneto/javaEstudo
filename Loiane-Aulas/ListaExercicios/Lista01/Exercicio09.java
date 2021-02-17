package Lista01;
/*
 * Exercicio 9
 * Autor: luizfcneto
 * Email: luizfcneto123@gmail.com
 * 
 * Descricao: Fazer um programa que calcule a conversao de temperatura em graus farenheit para graus Celsius 
 * Entrada: temperatura em Farenheit
 * Saida: temperatura convertida em Celcius
 */

import java.util.Scanner;

public class Exercicio09 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		double temperaturaFarenheit, temperaturaCelcius;
		
		System.out.println("Informe a temperatura em graus Farenheit: ");
		temperaturaFarenheit = entrada.nextDouble();
		temperaturaCelcius = convertFarenheitToCelcius(temperaturaFarenheit);
		System.out.println("Farenheit: "+ temperaturaFarenheit + " = " + temperaturaCelcius + " Celcius, aproximadamente");
		entrada.close();
	}
		
	public static double convertFarenheitToCelcius(double temperaturaFarenheit) {
		return ( 5 * ( temperaturaFarenheit - 32 ) / 9 );
	}

}
