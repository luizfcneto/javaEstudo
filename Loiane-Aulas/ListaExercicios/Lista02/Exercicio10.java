package Lista02;
import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String turno;
		System.out.println("Informe M(matutino), V(vespertino), N(noturno)");
		turno = entrada.next();
		
		if(turno.length() > 1) {
			System.out.println("Entrada invalida");

		}else {
			switch(turno) {
				case "M":
				case "m":
					System.out.println("Bom dia!");
					break;
				
				case "V":
				case "v":
					System.out.println("Boa Tarde!");
					break;
				
				case "N":
				case "n":
					System.out.println("Boa Noite!");
					break;
					
				default:
					System.out.println("Turno Inválido");
			}
		}
		entrada.close();
	}
	
}
