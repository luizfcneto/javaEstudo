/*
 * 		Exercicio 09
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Receber dois vertices diagonalmente 
 *   opostos de um retangulo e uma coordenada (x,y) 
 *   de um ponto e verificar se esse ponto esta 
 *   dentro do retangulo
 * 	Entrada: Vertice1 (x1, y1) (int) , vertice2 (x2,y2) (int) e um ponto (x3, y3) (int)
 * 	Saida: Esta dentro ou nao (String)
 * 
 */

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vertice1x, vertice1y, vertice2x, vertice2y, dotx, doty;
		System.out.println("Informe as coordenadas (x,y) do primeiro vertice:  ");
		vertice1x = scan.nextInt();
		vertice1y = scan.nextInt();
		
		System.out.println("Informe as coordenadas (x,y) do segundo vertice:  ");
		vertice2x = scan.nextInt();
		vertice2y = scan.nextInt();
		
		System.out.println("Informe as coordenadas (x,y) do ponto: ");
		dotx = scan.nextInt();
		doty = scan.nextInt();
		
		if ( dotx >= vertice1x && dotx <= vertice2x && doty >= vertice1y && doty <= vertice2y )
			System.out.println("Esta dentro do retangulo!");
		else 
			System.out.println("Esta fora do retangulo!");
		
	}
	
}
