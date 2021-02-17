package Aula04;

public class Variaveis {
	
	public static void main(String[] args) {
		
		//Variáveis inteiras
		byte varByte = 127;
		short varPequeno = 32767;
		int varNormal = 2147483647;
		//long varGrande = 9223372036854775807;
		
		System.out.println("Byte: "+varByte);
		System.out.println("Short: "+varPequeno);
		System.out.println("int: "+varNormal);
		//System.out.println("long: "+varGrande);
		
		
		
		
		//Variáveis ponto flutuante
		float valor1 = 106.35f;
		double valor2 = 234.78;
		
		System.out.println("float: "+valor1);
		System.out.println("double: "+valor2);
		
		
		//Variáveis char
		char o = 'o';
		char i = 'i';
		
		char interrogacao = 0x00E1; // valor 'á'
		
		//errado
		System.out.println(i+o);
		
		//correto
		System.out.println(""+o+i+interrogacao);
		
		
		//boolean
		boolean verdadeiro = true;
		boolean falso = false;
		
		
		System.out.println(verdadeiro + " or " + falso + " eis a questão" );
		
		
	}
	
}
