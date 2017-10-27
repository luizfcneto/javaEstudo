/*
 * 		Exercicio 7
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição:Ler 5 numeros e imprimir o maior deles
 * 	Entrada: 5 numeros
 * 	Saida: o Maior numero
 * 
 */

import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		int contador = 0;
		int numero, maior;
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite um numero: ");
		numero = entrada.nextInt();
		maior = numero;
		for (;contador < 4; contador++) {
			System.out.println("Informe outro numero:");
			numero = entrada.nextInt();
			if ( numero >= maior )
					maior = numero;
		
		}
		
		System.out.println("Maior numero digitado foi: " + maior);
	}

}
