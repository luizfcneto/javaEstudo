package Lista04;
/*
 * 		Exericio 04
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: VetorA[15] -> double, Construir B 
 *   mesmo que A, sendo cada elemento de B = sqrt(A)
 * 	Entrada: NULL
 *	Saida: NULL
 * 
 */

public class Exercicio04 {

	public static void main(String[] args) {
		double[] vetorA = new double[15];
		double[] vetorB = new double[vetorA.length];
		int i = 0;
		
		//inserindo no vetor A:
		for (; i < vetorA.length; i++) {
			vetorA[i] = i;
		}
		
		i = 0;
		//transferindo dados de A para B:
		for ( double elementos : vetorA) {
			vetorB[i] = Math.sqrt(vetorA[i]);
			i++;
		}
		
		//imprimindo vetores A e B:
		for ( i = 0; i < vetorA.length; i++) {
			System.out.println("VetorA: "+vetorA[i]+" VetorB : "+vetorB[i]);
		}		
	}
	
}