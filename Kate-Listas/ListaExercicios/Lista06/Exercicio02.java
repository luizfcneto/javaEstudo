package Lista06;
/*
 * 		Exercicio02
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: ler 3 numeros informados pelo usuario e
 * 	 verificar se eles formam um triangulo
 * 	Entrada: 3 numeros (int)
 * 	Saida: 1 boolean 
 *
 */

import java.util.Scanner;

public class Exercicio02 {

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
		}else {
			triangle = false;
		}
		System.out.println(triangle);
		scan.close();
	}
	
}
