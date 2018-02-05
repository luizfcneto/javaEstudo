import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("Informe o numero: ");
		numero = entrada.nextInt();
		if(numero < 0) {
			System.out.println("Numero negativo");
		}else {
			System.out.println("Numero positivo");
		}
	}
	
}
