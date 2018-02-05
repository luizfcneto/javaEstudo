/*
 * 		Exericio 8
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com
 * 	Descrição: Ler 5 numeros e informar 
 * 	a soma e a média dos numeros
 * 	Entrada: (int)
 * 	Saida: (int)
 * 
 */

import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		int contador, numeros, soma = 0;
		double media;
		Scanner entrada = new Scanner(System.in);
		
		for (contador = 0; contador < 5; contador ++) {
			System.out.println("Informe o numero: ");
			numeros = entrada.nextInt();
			soma = soma + numeros;
			
		}
		
		media = soma/5;
		System.out.println("Soma dos numeros: "+ soma + "  media: "+ media );
	}
	
}
