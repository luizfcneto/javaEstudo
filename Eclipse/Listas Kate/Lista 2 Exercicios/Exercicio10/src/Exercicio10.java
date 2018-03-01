/*
 * 		Exercicio 10
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: ler a capacidade maxima de container 
 *   que um caminhao suporta, receber a quantidade de 
 *   containers que a empresa tem que transportar, 
 *   calcular a quantidade de caminhoes necessarios para
 *   transportar todos os containers e calular a porcentagem
 *   de ocupação do ultimo caminhao.
 * 	Entrada: Quantidade Containers o caminhao suporta (int), 
 *   quantidade de containers para tranportar (int)
 * 
 *  Saida: Quantidade de caminhoes necessarios (int)
 *  	porcentagem de ocupação do ultimo caminhao (double)
 * 
 */

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int trucksLimit, numberOfTrucks, numberOfContainers; 
		double taxOfLasTruck;
		
		System.out.println("Informe a capacidade de containers q um caminhao suporta:");
		trucksLimit = scan.nextInt();
	
		System.out.println("Informe a quantidade de containers que deseja transportar: ");
		numberOfContainers = scan.nextInt();
		
		numberOfTrucks = (numberOfContainers / trucksLimit)+1;
		taxOfLasTruck = (numberOfContainers%trucksLimit)/ (double)trucksLimit;
		System.out.println("Quantidade de Caminhoes: "+numberOfTrucks+" Porcentagem de ocupação do ultimo: "+taxOfLasTruck);
	}
	
}
