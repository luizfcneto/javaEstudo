import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String letra;
		letra = entrada.next();
		switch(letra) {
			case "A":
			case "a":
			case "e":
			case "E":
			case "I":
			case "i":
			case "O":
			case "o":
			case "u":
			case "U":
				System.out.println("É Vogal");
				break;
			default:
				System.out.println("É consoante");
		}
	}
	
}
