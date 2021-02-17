package Lista04;
/*
 * 		Exericio 05
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: VetorA[15] -> int, Construir B 
 *   mesmo que A, sendo cada elemento de B = A*i; 
 * 	Entrada: NULL
 *	Saida: NULL
 * 
 */
public class Exercicio05 {

	public static void main(String[] args) {
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		int i = 0;
		
		//inserindo no vetor A:
		for (; i < vetorA.length; i++) {
			vetorA[i] = i;
		}
		
		i = 0;
		//transferindo dados de A para B:
		for ( int elementos : vetorA) {
			vetorB[i] = vetorA[i] * i;
			i++;
		}
		
		//imprimindo vetores A e B:
		for ( i = 0; i < vetorA.length; i++) {
			System.out.println("VetorA: "+vetorA[i]+" VetorB : "+vetorB[i]);
		}		
	}
	
}