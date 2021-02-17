package Lista02;
/*
 *		Exercicio 16
 *	Autor: Luiz Fernando (Luizfcneto)
 *	Email: Luizfcneto123@gmail.com
 *	Descrição: Informar de acordo com a tabela, o imc
 *   de uma pessoa.
 *	Entrada: peso (double), altura(double)
 *	Saida: tabela na questao
 * 
 * 
 */

import java.util.Scanner;
public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double weight, height, imc;
		System.out.println("Informe seu peso e altura, respectivamente:");
		weight = scan.nextDouble();
		height = scan.nextDouble();
		
		imc  = weight/(height*height);
		if (imc < 20) {
			System.out.println("Abaixo do peso" + imc);
		}else if (imc >= 20 && imc < 25) {
			System.out.println("Peso normal" + imc);
		}else if (imc >= 25 && imc < 30) {
			System.out.println("Sobre Peso" + imc);
		}else if (imc >= 30 && imc < 40) {
			System.out.println("Obeso" + imc);
		}else if (imc >= 40) {
			System.out.println("Obeso Morbido" + imc);
		}else {
			System.out.println("Invalido");
		}
		scan.close();
	}
	
}
