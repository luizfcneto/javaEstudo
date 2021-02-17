package Lista02;
import java.util.Scanner;
public class Exercicio09 {
	
	public static void main(String[] args) {
		int numero1, numero2, numero3;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe 3 numeros: ");
		
		numero1 = entrada.nextInt();		
		numero2 = entrada.nextInt();
		numero3 = entrada.nextInt();
		
		
		if (numero1 > numero2 && numero1 > numero3) {
			if (numero2 > numero3) {
				System.out.println(numero1 + " > "+ numero2 + " > "+numero3);
			}else {
				System.out.println(numero1 + " > "+ numero3 + " > "+numero2);
			}
		}else if( numero2 > numero3 && numero3 > numero1) {
			System.out.println(numero2 + " > " + numero3 + " > " + numero1);
		}else if ( numero2 > numero1 ) {
			System.out.println(numero3 + " > " + numero2 + " > " + numero1);
		}
		else {
			System.out.println(numero3 + " > "+ numero1 + " > " + numero2 );
		}
		entrada.close();
	}
	
	
}
