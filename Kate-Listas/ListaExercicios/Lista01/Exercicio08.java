package Lista01;
/*
 * 		Exercicio 08
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: receber o raio de uma circunferencia 
 *   e exibir sua circunferencia e area
 * 	Entrada: raio de circunferencia (double)
 * 	Saida: circunferencia e area , 2 (double)
 * 
 */

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double area, radius, circumference;
		System.out.println("Informe o raio da circunferencia: ");
		radius = scan.nextDouble();
		
		area = Math.PI*radius*radius;
		circumference = 2*Math.PI*radius;
		System.out.println("Area: "+area+ " Circunferencia: "+ circumference);
		scan.close();
	}
	
}
