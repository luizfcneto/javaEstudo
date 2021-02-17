package Lista01;
/*
 * Exercicio 3
 * Autor: luizfcneto
 * Email: luizfcneto123@gmail.com
 * Descrição: imprimir a soma de dois valores de entrada
 * 
 * Entrada: dois numeros
 * Saida: Soma dos dois numeros
 *
 * 
 */
import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero1, numero2;
		
		System.out.println("Digite dois numeros quaisquer: ");
		numero1 = entrada.nextDouble();
		numero2 = entrada.nextDouble();
	
		System.out.println("A soma de "+ numero1 + " + " + numero2 + " = " + (numero1+numero2) );
		entrada.close();
	}
		
}
