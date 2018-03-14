/*
 * 		Exercicio 06
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com	
 * 	Descrição: programa que recebe idade e sexo de 
 *   12 pessoas e mostre a idade media do grupo,
 *   idade media das mulheres e a idade media dos 
 *   homens
 *   
 * 	Entrada: 12 idades (int) e 12 sexos (String)
 * 	Saida: idade media do grupo (double),
 * 	 	idade media das mulheres (double),
 * 		idade media dos homens (double)
 *
 */

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] groupAges = new int[12];
		String[] groupSex = new String[12];
		
		int mansCounter = 0, womenCounter = 0, counter;
		double averageGroup = 0, averageMan = 0 , averageWomen = 0;
	
		for (counter = 0; counter < groupAges.length; counter++) {
			System.out.println("Informe a idade dessa pessoa:");
			groupAges[counter] = scan.nextInt();
			
			System.out.println("Informe o Sexo dessa pessoa: M(Masculino), F(Feminino)");
			groupSex[counter] = scan.next();
			
			switch(groupSex[counter]) {
				case "F":
					averageWomen += groupAges[counter]; 
					womenCounter ++;
					break;
			
				case "M":
					averageMan += groupAges[counter];
					mansCounter ++;
					break;
			
				default:
					System.out.println("SEXO Invalido");
					break;
			}
			averageGroup +=  groupAges[counter];
		}
		
		averageGroup = averageGroup/groupAges.length;
		averageWomen = averageWomen/womenCounter;
		averageMan = averageMan/mansCounter;
		
		System.out.println("Media Geral: " + averageGroup + " Média das Mulheres: " + averageWomen + " Média dos Homens: " + averageMan);
		
	}
	
}
