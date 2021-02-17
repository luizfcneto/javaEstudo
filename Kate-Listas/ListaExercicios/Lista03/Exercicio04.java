package Lista03;
/*
 * 		Exercicio 04
 *	Autor: Luiz Fernando (Luizfcneto)
 *	Email: Luizfcneto123@gmail.com
 *	Descrição: Leia n numeros e calcule a soma dos que 
 *   sao primos.
 *    
 *	Entrada: n numeros(int) 
 *	Saida: soma dos numeros que sao primos (int)
 * 
 */


import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sumOfPrimes = 0;
		int numbers;
		System.out.println("Informe um numero, para parar digite: -1");
		numbers = scan.nextInt();
		while (numbers != -1) {
			if (isPrime(numbers) == true) {
				sumOfPrimes = sumOfPrimes + numbers;
				System.out.println(sumOfPrimes);
			}
			System.out.println("Informe um numero, para parar digite: -1");
			numbers = scan.nextInt();
		}
		System.out.println(sumOfPrimes);
		scan.close();
	}
	
	
	public static boolean isPrime(int number) {
		int counter = 3, aux = 0;
		boolean prime = false;
		
		if ( number == 2 || number == 1 ) {
			return true;
		}else {
			
			while ( number >= counter) {
				if (number % counter == 0) {
					aux ++;
					if (aux >= 2) {
						prime = false;
						break;
					}else if (counter == number && aux == 1) {
						prime = true;
						break;
					}
				}
				counter += 2;
			}
		}
		return prime;
	}
}
