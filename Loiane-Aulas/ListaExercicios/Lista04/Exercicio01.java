package Lista04;
/*
 * 		Exercicio 01:
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: Passar elementos de um vetor B para A
 * 	Entrada: NULL
 * 	Saida: NULL
 * 
 */


public class Exercicio01 {

	public static void main(String[] args) {
		int[] numerosA = new int[5];
		int[] numerosB = new int[5];
		int i = 0;
		
		numerosA[0] = 0;
		numerosA[1] = 1;
		numerosA[2] = 2;
		numerosA[3] = 3;
		numerosA[4] = 4;
		
		/*
		 * For Tradicional: 
		for (; i < numerosA.length; i++ ) {
			numerosB[i] = numerosA[i];
		}
		*/
		
		//enchanced for:
		for ( int numeros : numerosA) {
			numerosB[i] = numeros; 
			i++;
		}
		
		
		for ( i = 0; i < numerosA.length; i++ ) {
			System.out.println("Numeros A: "+ numerosA[i] + " Numeros B: "+ numerosB[i]);
		}
	
		
	}
	
}
