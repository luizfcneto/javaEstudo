/*
 * 		Exericio 5
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descricao: Quantidade de anos que a populacao
 * 	de A supera B com usuario informando as populaçoes
 * 	e as taxas de crescimento de cada cidade.
 * 	Entrada: Populacao das cidades A e B (por pessoa)
 * 	e a taxa de crescimento de cada uma respectivamente
 * 	Saida: quantidade de anos que A passa B
 * 
 */

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		int repete = 1;
		while (repete == 1) {
			int populacaoA, populacaoB;
			int ano = 0;
			double taxaCrescimentoA, taxaCrescimentoB;
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Informe a Populacao de A:");
			populacaoA = entrada.nextInt();
			
			while(populacaoA <= 0 ) {
				System.out.println("Erro, informe uma quantidade positiva!");
				populacaoA = entrada.nextInt();
			}
	
			System.out.println("Informe a Populacao de B:");
			populacaoB = entrada.nextInt();
			
			while ( populacaoB <= 0 ) {
				System.out.println("Erro, informe uma quantidade positiva!");
				populacaoB = entrada.nextInt();
			}
			
			System.out.println("Informe a taxa de crescimento da Cidade A e B(em decimal: 1,5 = 50% de crescimento) respectivamente: " );
			taxaCrescimentoA = entrada.nextDouble();
			taxaCrescimentoB = entrada.nextDouble();
			
			if ( populacaoA > populacaoB &&  taxaCrescimentoB < taxaCrescimentoA) {
				System.out.println("Erro, cidade B nunca irá alcancar populacao maior que A");
				System.out.println("Para sair do programa digite 0, para continuar digite 1!");
				repete = entrada.nextInt();
				
			}else if ( populacaoB > populacaoA && taxaCrescimentoA < taxaCrescimentoB  ) {
				System.out.println("Erro, cidade A nunca irá alcancar populacao maior que B");
				System.out.println("Para sair do programa digite 0, para continuar digite 1!");
				repete = entrada.nextInt();
			
			}
			else if (populacaoA > populacaoB ) {
				while(populacaoB < populacaoA) {
					populacaoA = (int) (populacaoA * taxaCrescimentoA);
					populacaoB = (int) (populacaoB * taxaCrescimentoB);
					ano++;
				}
				System.out.println("Para a cidade B passar a A são necessarios: "+ano+" anos");
				System.out.println("Para sair do programa digite 0, para continuar digite 1!");
				repete = entrada.nextInt();
			}
			else if ( populacaoB > populacaoA ) {
				while(populacaoA < populacaoB) {
					populacaoA = (int) (populacaoA * taxaCrescimentoA);
					populacaoB = (int) (populacaoB * taxaCrescimentoB);
					ano++;
				}
				System.out.println("Para a cidade A passar a B são necessarios: "+ano+" anos");
				System.out.println("Para sair do programa digite 0, para continuar digite 1!");
				repete = entrada.nextInt();
			}
		}		
	}
}
