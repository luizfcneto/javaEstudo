package Lista01;
/*
 * Exercicio 2
 * Autor: luizfcneto
 * Email: luizfcneto123@gmail.com
 * 
 * Descrição: Ler a entrada de um valor inteiro e printar no console "Voce entrou com o numero: "numeroDeEntrada""
 * Entrada: Numero inteiro
 * Saida: "Voce entrou com o numero: "numeroDeEntrada""
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		numero = entrada.nextInt();
		System.out.println("O numero informado foi: " + numero);
		entrada.close();
	}
}
