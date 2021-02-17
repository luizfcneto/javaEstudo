package Lista02;
import java.util.Scanner;
public class Exercicio01 {
	
	public static void main(String[] args) {
		int numero1, numero2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe dois numeros: ");
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		
		if (numero1 > numero2) {
			System.out.println(numero1 + " > " + numero2);
		}else {
			System.out.println(numero2 + " > " + numero1);
		}
		entrada.close();
	}
	
	
}
