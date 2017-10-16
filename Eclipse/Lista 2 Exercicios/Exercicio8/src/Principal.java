import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor1, valor2, valor3;
		System.out.println("Informe o preço dos 3 produtos:");
		
		valor1 = entrada.nextDouble();
		valor2 = entrada.nextDouble();
		valor3 = entrada.nextDouble();
		
		if(valor1 > valor2 && valor1 > valor3) {
			
			if(valor2 > valor3) {
				System.out.println("produto 3: "+valor3+ " reais");
			}else {
				System.out.println("produto 2: "+valor2+ " reais");
			}
		}else if (valor2 > valor3) {
			
			if(valor1 > valor3) {
				System.out.println("produto 3: "+valor3+ " reais");
			}else {
				System.out.println("produto 1: "+valor1+ " reais");
			}
		}else if (valor3 > valor1) {
			
			if(valor2 > valor1) {
				System.out.println("produto 1: "+valor1+ " reais");
			}else {
				System.out.println("produto 2: "+valor2+ " reais");
			}
		}
		
	}
	
}