/*
 * 		Exercicio 9
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com
 * 	Descrição: Imprimir numeros impares de 1 a 50
 * 	Entrada: NULL
 * 	Saida: numeros impares
 * 
 */

public class Principal {

	public static void main(String[] args) {
		for( int i = 0; i <= 50; i++ ) {
			if ( i%2 != 0 )
				System.out.println(i);
		}		
	}
}
