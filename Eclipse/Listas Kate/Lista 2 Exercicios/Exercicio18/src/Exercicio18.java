/*
 * 		Exercicio 18
 *  Autor: Luiz Fernando (Luizfcneto)
 *  Email: Luizfcneto123@gmail.com
 *  Descrição: Receber a distancia percorrida em (Km)
 *   e quantidade de combustivel (L) gasto e retornar
 *   quantos quilometros sao percorridos por litro.
 *   Sabendo que um carro economico percorre 15Km/L,
 *   diga se o veículo em questão é economico ou não
 *  
 *  Entrada: Distancia percorrida (Km - double),
 *   quantidade de combustivel gasto (L - double) 
 *  Saida: Se o carro é economico ou não (String)
 *  
 */

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double usedFuel, travelledDistance;
		
		System.out.println("Informe a distancia percorrida em (Km) e quantidade de combustivel gasto (L), respectivamente: ");
		travelledDistance = scan.nextDouble();
		usedFuel = scan.nextDouble();
		
		if ( travelledDistance/usedFuel >= 15) {
			System.out.println("Economico");
		}else {
			System.out.println("Não Economico");
		}
	
	}
	
}
