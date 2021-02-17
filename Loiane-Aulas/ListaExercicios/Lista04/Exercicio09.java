package Lista04;
/*
 * 		Exercicio 09
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: Vetores A e B com 10 elementos (int), 
 * 	Vetor C é a divisao dos respectivos 
 * 	elementos de A e B.
 * 	Entrada: NULL
 * 	Saida: NULL
 * 	 
 */

public class Exercicio09 {

	public static void main(String[] args) {
		double[] vetorA = new double[10];
		int[] vetorB = new int[10];
		int i = 0;
		
		//Populando vetores A e B
		for(; i < vetorA.length; i++) {
			vetorA[i] = i;
			vetorB[i] = 2*i;
		}
		
		//Criando e populando vetor C
		double[] vetorC = new double[vetorA.length];
		for(i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		
		//Imprimindo vetorC
		for (i = 0; i < vetorC.length; i++) {
			System.out.println("Vetor A: "+ vetorA[i] +" / Vetor B: "+vetorB[i] + " = VetorC: "+vetorC[i] );
		}
	}
	
}