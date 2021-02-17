package Aula05;
//importar biblioteca especifica da classe Scanner
import java.util.Scanner;

public class EntradaDados {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Leitura Frase
		System.out.println("Digite alguma coisa: ");
		String algo = scan.nextLine();
		System.out.println("Voce escreveu isso: " + algo);
		
		//Leitura uma Palavra
		System.out.println("Digite uma palavra: ");
		String palavra = scan.next();
		System.out.println("Palavra : " + palavra);
		
		//Leitura Inteiro
		System.out.println("Digite algum numero: ");
		int numero = scan.nextInt();
		System.out.println("Voce digitou o numero: " + numero );
	
		//Leitura Ponto Flutuante
		System.out.println("Digite algum numero com ponto flutuante: ");
		double saldo = scan.nextDouble();
		System.out.println("Seu saldo �: " + saldo);
	
	}
	
	
}

/*
> Existem outras duas maneiras de fazer, por�m a mais simples � pela classe Scanner
> Para isso existe um m�todo espec�fico para cada tipo de vari�vel
> Necessario usar a Classe Scanner, para isso � necess�rio utilizar uma biblioteca (java.util)

Exemplo:
		Scanner scan = new Scanner (System.in);
		
		//Lendo uma linha inteira
		String nome = scan.nextLine();
		
		//Lendo um inteiro
		int idade = scan.nextInt();
		
		//Lendo um double
		double saldo = scan.nextDouble();
*/