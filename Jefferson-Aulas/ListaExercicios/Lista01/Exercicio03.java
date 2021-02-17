package Lista01;
/*
 * 		Exercicio03
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Contar a quantidade de numeros pares em uma lista de inteiros
 * 	Entrada: n numeros (int) -> numbers
 * 	Saida: quantidade de pares na lista (int) -> counterEven 
 *
 */

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main( String[] args ) {
		Scanner scan = new Scanner( System.in );
		int counterEven  = 0, numbers = 0;
		
		while ( numbers != -1 ) {
			System.out.println("Informe o numero: [Para parar de inserir, digite -1]");
			numbers = scan.nextInt();
			
			if( numbers % 2 == 0 )
				counterEven++;
		}
		
		System.out.println( "Quantidade de pares: " + counterEven );
		scan.close();
	}
	
}
