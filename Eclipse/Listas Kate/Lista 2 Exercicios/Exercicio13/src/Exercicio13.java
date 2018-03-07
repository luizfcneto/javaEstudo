/*
 *		Exercicio 13
 *	Autor: Luiz Fernando (Luizfcneto)
 *	Email: Luizfcneto123@gmail.com
 *	Descrição: Receber 3 valores inteiros, verificar 
 *   se formam um triangulo e caso formem, informar qual
 *   o tipo de triangulo é formado de acordo com as
 *   informações indicadas na questão.
 *	Entrada: 3 numeros (int)
 *	Saida: Se forma um triangulo (Boolean) e tipo de 
 *	 triangulo 
 * 
 */

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int edge1, edge2, edge3;
		boolean triangle;
		
		System.out.println("Informe os lados do triangulo: ");
		edge1 = scan.nextInt();
		edge2 = scan.nextInt();
		edge3 = scan.nextInt();
		
		if( (Math.abs(edge2 - edge3) < edge1) && (edge1  < edge2 + edge3) && (Math.abs(edge1 - edge3) < edge2) && (edge2  < edge1 + edge3) && (Math.abs(edge1 - edge1) < edge3) && (edge3  < edge1 + edge2) ) {
			triangle = true;
			if (edge1 == edge2 && edge1 == edge3) {
				System.out.println(triangle);
				System.out.println("Equilatero!");
			} else if(edge1 != edge2 && edge2 != edge3) {
				System.out.println(triangle);
				System.out.println("Escaleno");
			} else {
				System.out.println(triangle);
				System.out.println("Isósceles");
			}
			
		}else {
			triangle = false;
			System.out.println("Triangulo Inexistente!");
		}
		
	
	}
	
}
