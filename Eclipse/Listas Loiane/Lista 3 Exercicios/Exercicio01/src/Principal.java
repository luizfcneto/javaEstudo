/*
 * 		Exercicio 01 
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com
 * 	Descrição: programa que fique lendo numeros de 0 a 10 e pare quando receber um numero invalido
 *	Entrada: numeros ( entre 0 e 10 ) ? inválido 
 *	Saida: numeros validos ou invalido 
 */

import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o numero: ");
		numero = entrada.nextInt();
		while (numero >= 0 && numero <= 10) {
			System.out.println("Numero Válido");
			System.out.println("Informe outro numero: ");
			numero = entrada.nextInt();
		}
		System.out.println("Numero invalido!");
	}
	
}
