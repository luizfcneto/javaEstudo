/*	
 * 		Exercicio01
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Receber 3 valores inteiros, verificar se formam um triangulo
 * 
 * 	Entrada: 3 lados do triangulo (int)	-> edge
 * 	Saida: formam ou nao triangulo (boolean) -> triangle
 * 
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main( String[] args ) {
		Scanner scan = new Scanner( System.in );
		int edge1, edge2, edge3;
		boolean triangle = false;
		
		System.out.println("Informe os tres lados do triangulo: ");
		edge1 = scan.nextInt();
		edge2 = scan.nextInt();
		edge3 = scan.nextInt();
		
		if ( ( Math.abs( edge2 - edge3 ) < edge1 ) && ( edge1  < edge2 + edge3 ) && ( Math.abs( edge1 - edge3 ) < edge2 ) && ( edge2  < edge1 + edge3 ) && ( Math.abs( edge1 - edge1 ) < edge3 ) && ( edge3  < edge1 + edge2 ) )
			triangle = true;
		else 
			triangle = false;
		
		System.out.println( "Triangulo existe? " + triangle );
	}
	
}
