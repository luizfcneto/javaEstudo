package Aula07;

import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//A partir do Java 7 é possivel fazer switch com strings
		switch(entrada.nextInt()) {
			case 1:
				System.out.println("Domingo");
				break;		//Necessário para nao imprimir os outros casos
				
			case 2: 
				System.out.println("Segunda");
				break;
				
			case 3:
				System.out.println("Terça");
				break;
				
			case 4: 
				System.out.println("Quarta");
				break;
				
			case 5:
				System.out.println("Quinta");
				break;
				
			case 6:	
				System.out.println("Sexta");
				break;
				
			case 7: 
				System.out.println("Sábado");
				break;
				
			default:
				System.out.println("Dia inválido");
				
				
		}
		
	}
	
	
}
