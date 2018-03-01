/*
 *		Exercicio11
 *	Autor: Luiz Fernando (Luizfcneto)
 *	Email: Luizfcneto123@gmail.com
 *	Descrição: Receber o codigo do item pedido, 
 *	 a quantidade desejada e informar o valor final, 
 *   de acordo com a tabela da questao.
 *	Entrada: Codigo(int), quantidade(int)
 *	Saida: Valor final(double)
 * 
 */

import java.util.Scanner;
public class Exercicio11 {

	static final double hotDogPrice = 1.10;			//100
	static final double bauruSimplePrice = 1.30;	//101
	static final double bauruWithEggsPrice = 1.50;	//102
	static final double hamburguerPrice = 1.10;		//103
	static final double cheeseburguerPrice = 1.30;	//104
	static final double sodaPrice = 1;				//105
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int code, quantity;
		double totalPrice;
		
		System.out.println("Informe o codigo e a quantidade pedida: ");
		code = scan.nextInt();
		quantity = scan.nextInt();
		
		switch(code) {
		case 100:
			totalPrice = quantity*hotDogPrice;
			System.out.println(totalPrice);
			break;
		
		case 101:
			totalPrice = quantity*bauruSimplePrice;
			System.out.println(totalPrice);
			break;
			
		case 102:
			totalPrice = quantity*bauruWithEggsPrice;
			System.out.println(totalPrice);
			break;
			
		case 103:
			totalPrice = quantity*hamburguerPrice;
			System.out.println(totalPrice);
			break;
			
		case 104:
			totalPrice = quantity*cheeseburguerPrice;
			System.out.println(totalPrice);
			break;
			
		case 105:
			totalPrice = quantity*sodaPrice;
			System.out.println(totalPrice);
			break;
			
		default:
			System.out.println("Codigo Invalido!!");
			break;
		}
		
		
	}
	
}
