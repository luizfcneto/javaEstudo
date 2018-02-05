/*
 * 		Exercicio 01 
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: Gerar uma matriz 4x4 com numeros aleatorios
 * 	entre 0 e 9 depois informe o maior numero e sua posicao
 *  (l,c)
 * 	Entrada: NULL
 * 	Saida: posicao (l,c) do maior elemento
 * 
 */
import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random gerador = new Random();
		int[][] matriz = new int[4][4];
		int i = 0, j = 0;
		int maior, aux ,l = 0 , c = 0;
		
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
		
		maior = matriz[0][0];
		//Verifica Maior Elemento e posicao(l,c):
		for ( i = 0; i < matriz.length; i++ ) {
			for ( j = 0; j < matriz.length; j++ ) {
				
				if ( maior < matriz[i][j]) {
					maior = matriz[i][j];
					l = i;
					c = j;
				}
			}
		}
		
		System.out.println("Maior Elemento: "+maior+" l: "+l+" c: "+c);
		
	}
	
}
