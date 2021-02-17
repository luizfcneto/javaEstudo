package Aula09;
/*
 * 		Aula 13 - For Each
 * 	A partir do Java 5
 */
public class ForEach {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		int i = 0;
		
		//For padrao:
		for ( i = 0; i < vetor.length; i++ ) {
			vetor[i] = i;
			System.out.println(vetor[i]);
		}
		
		//For melhorado (enhanced):
		for (int elemento : vetor) {
			System.out.println(elemento);
		}		
		
	}
}
