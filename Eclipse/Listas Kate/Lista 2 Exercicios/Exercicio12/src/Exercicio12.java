/*
 * 		Exercicio 12
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Conversor de temperaturas
 * 	Entrada: temperatura (double), Escala (char)
 * 	Saida: temperaturaConvertida (double) , outra Escala (char)
 * 
 */

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String scale;
		double temperature;
		
		System.out.println("Informe a temperatura e a escala (letra)" );
		temperature = scan.nextDouble();
		scale = scan.next();
			
		if( scale.length() > 1 )
			System.out.println("Escala inexistente!");
		
		else if(scale.equals("C") || scale.equals("c")) {
			temperature = 1.8*temperature + 32;
			System.out.println(temperature + "F");
			
		}else if (scale.equals("F") || scale.equals("f")) {
			temperature = (temperature - 32)/1.8;
			System.out.println(temperature + "C");
		}else {
			System.out.println("Escala Inexistente!!");
		}
	
	}
	
}
