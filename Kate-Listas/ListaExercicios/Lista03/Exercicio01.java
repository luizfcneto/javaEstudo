package Lista03;
/*
 * 		Exercicio 01
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Fazer um programa que imprima numeros pares
 * 	 entre 0 e 10.
 * 	Entrada: NULL
 * 	Saida: Numeros pares (de 0 a 10) (int)
 * 
 */

public class Exercicio01 {

	public static void main(String[] args) {
		int numbers;
		for ( numbers = 0; numbers<=10; numbers++) {
			if (numbers % 2 == 0) {
				System.out.println(numbers);
			}
		}
	}
	
}
