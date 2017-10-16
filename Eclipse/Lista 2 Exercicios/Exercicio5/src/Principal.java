import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		double nota1, nota2, notaFinal;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe as notas 1 e 2 respectivamente");
		
		nota1 = entrada.nextDouble();
		nota2 = entrada.nextDouble();
		
		notaFinal = calculaMedia(nota1,nota2);
		
		if(notaFinal == 10) {
			System.out.println("Aprovado com Distinção: "+ notaFinal);
		}else if( notaFinal >= 7 && notaFinal != 10) {
			System.out.println("Aprovado: "+ notaFinal);
		}else {
			System.out.println("Reprovado: "+ notaFinal );
		}
		
	}
	
	public static double calculaMedia(double n1, double n2) {
		return (n1+n2)/2;
	}
	
}
