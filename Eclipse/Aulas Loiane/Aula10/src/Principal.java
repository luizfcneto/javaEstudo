/*
 * AULA 10 - Break - 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com um numero:");
		int numero = entrada.nextInt();
		
		System.out.println("Entre com um limite: ");
		int maximo = entrada.nextInt();
		
		for(int i = numero ; i <= maximo; i++) {
			
			if( i % 7 == 0) {
				/*
				System.out.println(i + " é difivisel por 7");
				break;											//break literalmente aborta a funcao (Sai do for)
				*/											
				continue;
			}
			System.out.println(i);
		}
		
	}
	
}

/*
break; 		-> saia do Loop
continue; 	-> ignore  e faça a proxima iteração

*/