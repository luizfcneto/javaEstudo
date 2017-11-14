/*
 * 		Exercicio 02: 
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: Vetor B = 2* Vetor A;
 * 	Entrada: NULL
 * 	Saida: NULL
 * 
 */

public class Principal {

	public static void main(String[] args) {
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		int i = 0;
		
		//Populando vetorA:
		for(; i < vetorA.length; i++) {
			vetorA[i] = i;
		}
		
		i = 0;
		//Copiando elementos de A no B
		for ( int elementos : vetorA ) {
			vetorB[i] = elementos*2;
			i++;
		}
		
		//Imprimindo vetor A e B:
		for (i = 0; i < vetorA.length; i++) {
			System.out.println("vetorA : "+vetorA[i]+" VetorB: "+vetorB[i]);
		}
		
		
		
		
	}
	
}
