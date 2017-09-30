/*
 * Exercicio 4
 * Autor: luizfcneto
 * Email: luizfcneto123@gmail.com
 * 
 * Descrição: ler 4 notas (ponto flutuante) e fazer a media deles
 * Entrada: 4 numeros double
 * Saida: media das 4 notas
 * 
 * 
 */
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, nota3, nota4;
		
		System.out.println("Digite as 4 notas dos respectivos bimestres: ");
		nota1 = entrada.nextDouble();
		nota2 = entrada.nextDouble();
		nota3 = entrada.nextDouble();
		nota4 = entrada.nextDouble();
		
		System.out.println("Media das 4 notas: " + (nota1 + nota2 + nota3 + nota4)/4);
		
	}
	
}
