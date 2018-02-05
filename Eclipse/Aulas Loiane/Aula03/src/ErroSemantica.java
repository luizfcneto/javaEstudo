
public class ErroSemantica {
	
	public static void main(String[] args) {
		//Erro de declaraçao de variavel
		var int cont;
		
		//int cont	->Correto
		
		//Erro de variavel não inicializada
		System.out.println("Digitou: +"cont);
		
		/*
		 Correto:
		 	int cont = 0;
		 	System.out.println("Digitou: "+ cont);
		 */
		
		
	}
	
	
}
