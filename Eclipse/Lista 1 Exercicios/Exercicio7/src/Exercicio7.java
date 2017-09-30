/*
 * Exercicio 4
 * Autor: luizfcneto
 * Email: luizfcneto123@gmail.com
 * 
 * Descricao: Fazer um programa calcular a area de um quadrado, em seguida mostrar o dobro do resultado obtido para o usuario
 * Entrada: tamanho do lado do quadrado
 * Saida: Dobro da área desse quadrado
 * 
 */

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double lado, area;
		System.out.println("informe o tamanho do lado do quadrado em m: ");
		lado = entrada.nextDouble();
		area = calculaArea(lado);
		System.out.println("Dobro da área: "+ (2*area) + " m ");
		
	}
	
	public static double calculaArea(double lado) {
		return lado*lado;
	}

}
