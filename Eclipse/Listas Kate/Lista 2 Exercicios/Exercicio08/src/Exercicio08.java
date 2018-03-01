/*
 * 		Exercicio 08
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Programa para fazer conversoes de unidades, 
 *   com menu com opção de escolha, de acordo com a questao
 * 	Entrada: opcao (int), valor a ser convertido (double)
 * 	Saida: Valor convertido (double)
 *  
 */


import java.util.Scanner;

public class Exercicio08 {
	
	final static double convertLbToKg = 0.4536;
	final static double convertOzToG = 28.3495;
	
	public static void menu() {
		System.out.println("\t\t\t\t MENU \t\t\t\t\n\n ");
		System.out.println("\t 1 - Libra(lb) -> Quilograma(kg) \n");
		System.out.println("\t 2 - Quilograma(kg) -> Libra(lb) \n");
		System.out.println("\t 3 - Onça(oz) -> Grama(g) \n");
		System.out.println("\t 4 - Grama(g) -> Onça(oz) \n");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int option;
		double value;
		menu();
		option = scan.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Converter Libra (lb) para Quilograma (kg) \n") ; 
			System.out.println("Informe o valor em lb:");
			value = scan.nextDouble();
			System.out.println("Libra: "+ value + " Quilograma: "+ (value*convertLbToKg) );
			break;
			
		case 2:
			System.out.println("Converter Quilograma (Kg) para Libra (lb) \n") ; 
			System.out.println("Informe o valor em Kg:");
			value = scan.nextDouble();
			System.out.println("Quilograma: "+ value + " Libra: "+ (value/convertLbToKg) );
			break;
			
		case 3:
			System.out.println("Converter Onça (Oz) para Grama (g) \n") ; 
			System.out.println("Informe o valor em Oz:");
			value = scan.nextDouble();
			System.out.println("Onça: "+ value + " Grama: "+ (value*convertOzToG) );
			break;
			
		case 4:
			System.out.println("Converter Grama (g) para Onça (Oz) \n") ; 
			System.out.println("Informe o valor em Gramas:");
			value = scan.nextDouble();
			System.out.println("Gramas: "+ value + " Onça: "+ (value/convertOzToG) );
			
			break;
			
		default:
			System.out.println("Opçao invalida! \n");
			break;
		}
		
		
	}
	
}
