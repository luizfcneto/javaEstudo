class ErroSemantica {
	 
	public static void main ( String[] args ) {
		//Erro de declaraçao de variável
		//var int cont;


		/*
		int cont;
		//Erro de variavel não inicializada
		System.out.println("Digitou: " + cont);
		*/

		//Correto
		int cont = 0;
		System.out.println("Digitou: " + cont);
	}

}