/*
 * 		Exercicio 03
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: Preencher uma Matriz 3x3 (int), depois 
 * 	 informar a quantidade de numeros pares e 
 * 	 impares.
 * 	
 * 	Entrada: (Int)
 * 	Saida: qtd de pares e impares na matriz(3x3)
 *  
 */

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int i = 0, j = 0, qtdImpar = 0, qtdPar = 0;
		
		
		//Populando a Matriz:
		for ( i = 0; i < matriz.length; i++ ) {
			for ( j = 0; j < matriz[i].length; j++ ) {
				System.out.println("Informe o numero da posicao: "+i+","+j);
				matriz[i][j] = entrada.nextInt();
			}
		}
		System.out.println();
		
		//Imprimindo a Matriz:
		for ( i = 0; i < matriz.length; i++ ) {
			for ( j = 0; j < matriz[i].length; j++ ) {
				System.out.print(" ["+i+"]["+j+"]: "+matriz[i][j]+" \t");
				
			}
			System.out.println();
		}
		
		//Verificar quantidade de pares e impares:
		for ( i = 0; i < matriz.length; i++ ) {
			for ( j = 0; j < matriz[i].length; j++ ) {
				if ( matriz[i][j] % 2 == 0) 
					qtdPar++;
				else 
					qtdImpar++;
			}
		}
		
		
		System.out.println("Quantidade de Pares: "+qtdPar+ "   Quantidade de Impares: "+qtdImpar);
	}

	
}
