/*
 * 		Exercicio 02
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: Gerar uma matriz 10x10 com numeros aleatorios
 * 	entre 0 e 9 depois informe o menor valor 
 * 	 da linha 5 e sua posicao e qual o maior e o 
 *   menor da coluna 7
 *  (l,c)
 * 	Entrada: NULL
 * 	Saida: menor da linha 5, maior e menor da coluna 7
 *
 */
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random gerador = new Random();
		int[][] matriz = new int[10][10];
		int i = 0, j = 0;
		int maior, menor , l5 = 5, c7 = 7, lb = 0 , cb = 0, ls = 0, cs = 0;
		
		//populando a matriz:
		for ( i = 0; i < matriz.length; i++) {
			for ( j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = gerador.nextInt(9);

			}
		}
		
		//Imprime Matriz:
		for ( i = 0; i < matriz.length; i++) {
			for ( j = 0; j < matriz[i].length; j++ ) {
				System.out.print(i+","+j+": "+matriz[i][j] + "\t\t");
			}
			System.out.println();
		}
		
		menor = matriz[l5][0];
		
		//Verifica menor Elemento da linha 5:
		for ( i = 0; i < matriz.length; i++ ) {
			for ( j = 0; j < matriz.length; j++ ) {
				
				if (i == l5) {
					if ( menor > matriz[i][j]) {
						menor = matriz[i][j];
						ls = i;
						cs = j;
					}
				}
				
			}
		}
		
		System.out.println("Menor Elemento: "+menor+"  ["+ls+"] ["+cs+"] ");
		
		maior = matriz[0][c7];
		
		//Verifica o Maior Elemento da coluna 7 :
		for ( i = 0; i < matriz.length; i++ ) {
			for ( j = 0; j < matriz.length; j++ ) {
				if (j == c7) {
					if ( maior <= matriz[i][j]) {
						maior = matriz[i][j];
						lb = i;
						cb = j;
						
					}
				}
			}
		}
		
		System.out.println("Maior Elemento: "+maior+"  ["+lb+"] ["+cb+"] ");
		
		menor = matriz[0][c7];
		//Verifica o Menor Elemento da coluna 7 :
				for ( i = 0; i < matriz.length; i++ ) {
					for ( j = 0; j < matriz.length; j++ ) {
						if ( j == c7) {
							if ( menor >= matriz[i][j]) {
								menor = matriz[i][j];
								ls = i;
								cs = j;
							}
						}
					}
				}
		
		System.out.println("Menor Elemento: "+menor+"  ["+ls+"] ["+cs+"] ");
	}
	
}
