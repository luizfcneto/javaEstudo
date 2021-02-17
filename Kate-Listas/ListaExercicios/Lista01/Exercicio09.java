package Lista01;
/*
 * 		Exercicio 09
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Receber comprimento dos lados de um retangulo
 * 	 e exibir o perimetro e a area desse retangulo 
 * 	Entrada: 2 doubles (lados) 
 *  Saida: Area (double), perimetro (double)
 * 
 */

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double width, height, area, perimeter;
		System.out.println("Informe a altura e a largura de um retangulo:");
		height = scan.nextDouble();
		width = scan.nextDouble();
		
		area = width*height;
		perimeter = (2*width)+(2*height);
		
		System.out.println("Area: "+area+" Perimetro: "+perimeter);
		scan.close();
	}
	
}
