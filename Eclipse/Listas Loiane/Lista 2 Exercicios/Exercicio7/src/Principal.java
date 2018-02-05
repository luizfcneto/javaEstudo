import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2, numero3;
		System.out.println("Informe 3 numeros: ");
		
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		numero3 = entrada.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			if(numero2 > numero3) {
				System.out.println("Maior: "+ numero1 + " e Menor: "+ numero3);
			}else {
				System.out.println("Maior: "+ numero1 + " e Menor: "+ numero2);
			}
		}else if(numero2 > numero3) {
			if(numero1 > numero3) {
				System.out.println("Maior: "+ numero2 + " e Menor: "+ numero3);
			}else {
				System.out.println("Maior: "+ numero2 + " e Menor: "+ numero1);
			}
		}else {
			if (numero1 > numero2) {
				System.out.println("Maior: "+ numero3 + " e Menor: "+ numero2);
			}else {
				System.out.println("Maior: "+ numero3 + " e Menor: "+ numero1);
			}
			
		}
		
	}
	
	
}
