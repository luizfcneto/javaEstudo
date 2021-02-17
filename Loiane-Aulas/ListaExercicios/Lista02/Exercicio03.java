package Lista02;
import java.util.Scanner;
public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String sexo;
		
		System.out.println("Informe o sexo, digitando M(masculino ou F(feminino)");
		sexo = entrada.next();
		switch(sexo) {
			case "M":
				System.out.println("Sexo Masculino");
				break;
				
			case "F":
				System.out.println("Sexo Feminino");
				break;
		
			default:
				System.out.println("Sexo Invalido!");
				break;
		}
		entrada.close();
	}
	
}
