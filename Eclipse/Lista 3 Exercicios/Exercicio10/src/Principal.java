/*
 * 		Exericio 10
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: Receber dois valores inteiros e 
 * 	 retornar os numeros que estão entre eles
 * 	Entrada: 2 (int)
 * 	Saída: lista de (int)
 *
 */

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contador, min, max, aux;
		System.out.println("Informe dois numeros:");
		min = entrada.nextInt();
		max = entrada.nextInt();
		
		//ajeita quem é menor e maior
		if( min > max ) {
			aux = max;
			max = min;
			min = aux;
		}
		
		for (contador = min+1; contador < max; contador++) {
			System.out.println(contador);
		}
		
	}
	
}
