package Aula06;

public class Condicional {
	
	public static void main(String[] args) {
		int numero1 = 15;
		String nome = "Luiz Fernando";
		
		//Se
		if (numero1 == 10) {
			System.out.println("numero: "+ numero1);
		} 
		
		//Se
		if (numero1 < 20 && numero1 > 5) {
			System.out.println("Numero é menor que 20 e maior que 5");
		}	
		//Senao
		else {
			System.out.println("numero != "+ numero1 + "Nome: "+ nome);
		}
		
		
	}
	
}
