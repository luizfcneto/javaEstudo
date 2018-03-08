/*
 *		Exercicio 20
 *	Autor: Luiz Fernando (Luizfcneto)
 *	Email: Luizfcneto123@gmail.com
 *	Descrição: Esse programa ira receber um caracter
 *   especial indicando uma operação basica matematica
 *   "+", "-", "/", "*", e dois numeros que irão realizar
 *   esta operação:  a "op" b = resultado
 *	 
 *	Entrada: numero1 (double), operacao (String),
 * 	 numero 2 (double)
 * 
 *  Saida: resultado (double)
 * 
 */

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double number1, number2, result;
		String operation;
		System.out.println("Informe a operação: \"+\", \"-\", \"/\", \"*\"");
		operation = scan.nextLine();
		
		System.out.println("Informe o primeiro numero:");
		number1 = scan.nextDouble();
		
		System.out.println("informe o segundo numero:");
		number2 = scan.nextDouble();
		
		switch(operation) {
			case "+": 
				result = number1 + number2;
				System.out.println(number1 +" "+ operation +" "+ number2+ " = "+ result);
				break;
				
			case "-":
				result = number1 - number2;
				System.out.println(number1 +" "+ operation +" "+ number2+ " = "+ result);
				break;
				
			case "/":
				result = number1 / number2;
				System.out.println(number1 +" "+ operation +" "+ number2+ " = "+ result);
				break;
				
			case "*":
				result = number1 * number2;
				System.out.println(number1 +" "+ operation +" "+ number2+ " = "+ result);
				break;
				
			default:
				System.out.println("Operação invalida!");
				break;
		}
		
	}
	
	
}
