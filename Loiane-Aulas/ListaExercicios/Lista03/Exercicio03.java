package Lista03;

/*
 * 		Exercicio 3
 * Autor: Luiz Fernando (luizfcneto)
 * Email: luizfcneto123@gmail.com
 * Descrição: Fazer um programa que valide nome maior que 3
 * caracteres, idade entre 0 e 150, salario > 0, sexo, 'f' ou 'm'
 * Estado Civil 's', 'c', 'v', 'd'
 * Entrada: String, int, double, Char, Char
 * Saida:    "  " , "" ,  "  " , " " , " "
 * 
 */
import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome;
		char sexo, estadoCivil;
		int idade;
		double salario;
		
		//nome
		System.out.println("Informe seu nome: ");
		nome = entrada.nextLine();
		while ( nome.length() <= 3 ) {		
			System.out.println("nome invalido, digite novamente: ");
			nome = entrada.next();
		}
		
		//idade
		System.out.println("Informe a idade: ");
		idade = entrada.nextInt();
		while(idade < 0 || idade > 150) {
			System.out.println("idade invalida, digite novamente: ");
			idade = entrada.nextInt();
		}
		
		//salario
		System.out.println("Informe o salario: ");
		salario = entrada.nextDouble();
		while ( salario <= 0) {
			System.out.println("salario invalido, digite novamente: ");
			salario = entrada.nextDouble();
		}
		
		//sexo		
		System.out.println("Informe o Sexo: ");
		sexo = entrada.next().charAt(0);
		//
		
		while ( sexo != 'f' && sexo != 'm' ) {
			System.out.println("Sexo inválido, digite novamente: ");
			sexo = entrada.next().charAt(0);
		}
		
		//estado Civil	
		System.out.println("Informe o Estado Civil: ");
		estadoCivil = entrada.next().charAt(0);
		while ( estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'm' ) {
			System.out.println("Estado Civil inválido, digite novamente: ");
			estadoCivil = entrada.next().charAt(0);
		}
		entrada.close();
	}
	
}