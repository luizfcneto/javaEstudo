package Lista02;
/*
 * 		Exercicio06
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Calcular multa para o pagamento de um 
 * 	 determinado imposto dado pela questao.
 * 	Entrada: Valor do imposto (double) e quantidade de meses atrasado (int)
 * 	Saida: Valor da multa a ser pago somados com o valor do imposto (double)
 * 
 */

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double impost, fine;
		int months;
		System.out.println("Informe o valor do imposto e quantidade de meses atrasados, respectivamente: ");
		impost = scan.nextDouble();
		months = scan.nextInt();
	
		if (impost >= 100 && impost <= 500) {
			fine  = 4;
			System.out.println( (months*fine)+impost);
		}else if (impost < 100 && impost > 0) {
			fine = 2;
			System.out.println( (months*fine)+impost);
		}else {
			fine = 8;
			System.out.println( (months*fine)+impost);
		}
		scan.close();
	}
	
}
