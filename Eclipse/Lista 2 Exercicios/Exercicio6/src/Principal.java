import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		int numero1, numero2, numero3, maior;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe 3 numeros");
		
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		numero3 = entrada.nextInt();
		
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("Maior : "+numero1);
		}else if (numero2 > numero3) {
			System.out.println("Maior :"+numero2);
		}else {
			System.out.println("Maior : "+numero3);
		}
	
	}
	
}
