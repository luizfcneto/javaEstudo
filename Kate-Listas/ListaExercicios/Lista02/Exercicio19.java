package Lista02;
/*
 * 		Exercicio 19
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Receber o destino do passageiro, se a 
 * 		viagem inclui retorno (ida e volta) e retorna
 *  	o preço da passagem conforme a tabela dada 
 * 		no enunciado da questão
 * 
 * 	Entrada: nome da região da viagem (String),
 * 		viagem inclui ida e volta (boolean)
 * 
 * 	Saida:	preço da viagem (double)
 */

import java.util.Scanner;

public class Exercicio19 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double price;
		String region, confirmRegion;
		boolean idaEVolta = false;
		
		System.out.println("Informe qual a região que irá viajar:");
		region = scan.nextLine();
		
		if ( region.equals("Norte") ) {
			
			System.out.println("Norte, agora informe se deseja pagar ida e volta(S/N):");
			confirmRegion = scan.nextLine();
			
			switch(confirmRegion) {
				case "S": 
				case "s":
					idaEVolta = true;
					price = 900;
					System.out.println(price);
					break;
				
				case "n":
				case "N":
					price = 500;
					System.out.println(price);
					break;
				default:
					System.out.println("Resposta errada, digite S para sim se deseja incluir ida e volta, ou N");
					break;
			}
		} else if ( region.equals("Nordeste") ) {	
			System.out.println("Nordeste, agora informe se deseja pagar ida e volta(S/N):");
			confirmRegion = scan.nextLine();
				
			switch(confirmRegion) {
				case "S": 
				case "s":
					idaEVolta = true;
					price = 650;
					System.out.println(price);
					break;
			
				case "n":
				case "N":
					price = 350;
					System.out.println(price);
					break;
				default:
					System.out.println("Resposta errada, digite S para sim se deseja incluir ida e volta, ou N");
					break;
			}
		} else if ( region.equals("Centro-Oeste") ) {
			System.out.println("Norte, agora informe se deseja pagar ida e volta(S/N):");
			confirmRegion = scan.nextLine();
					
			switch(confirmRegion) {
				case "S": 
				case "s":
					idaEVolta = true;
					price = 600;
					System.out.println(price);
					break;
						
				case "n":
				case "N":
					price = 350;
					System.out.println(price);
						break;
				default:
					System.out.println("Resposta errada, digite S para sim se deseja incluir ida e volta, ou N");
					break;
			}
		}else if ( region.equals("Sul") ) {
			System.out.println("Sul, agora informe se deseja pagar ida e volta(S/N):");
			confirmRegion = scan.nextLine();
					
			switch(confirmRegion) {
				case "S": 
				case "s":
					idaEVolta = true;
					price = 550;
					System.out.println(price);
					break;
						
				case "n":
				case "N":
					price = 300;
					System.out.println(price);
					break;
				default:
					System.out.println("Resposta errada, digite S para sim se deseja incluir ida e volta, ou N");
					break;
			}
		}else if ( region.equals("Sudeste") ) {
			System.out.println("Sudeste, agora informe se deseja pagar ida e volta(S/N):");
			confirmRegion = scan.nextLine();
					
			switch(confirmRegion) {
				case "S": 
				case "s":
					idaEVolta = true;
					price = 700;
					System.out.println(price);
					break;
					
				case "n":
				case "N":
					price = 400;
					System.out.println(price);
					break;
				default:
					System.out.println("Resposta errada, digite S para sim se deseja incluir ida e volta, ou N");
					break;
			}	
		}
		else {
			System.out.println("Região desconhecida: \n\tNorte \n\tNordeste \n\tCentro-Oeste \n\tSul \n\tSudeste ");
		}
		
		scan.close();
	}
}