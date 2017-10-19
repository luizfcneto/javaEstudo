
public class Principal {
	
	public static void main(String[] args) {
		int contador = 0;
		int maximo = 10;
		
		for (contador = 0; contador < maximo; contador++) {
			System.out.println("Contador: "+ contador);
		}
		System.out.println("---------------------\n");
		maximo = 0;		
		for (; contador > maximo ; contador--) {
			System.out.println("Contador: "+ contador);
		}
		
	}
	
}


/*
como já sabiamos que o valor de contador já era 0, nao houve necessidade
de reescreve-lo, pela sintaxe do for, podemos simplesmente deixar em branco

	sintaxe for1: for( inicialização; condição; atualização){
		instruções
	}

*/