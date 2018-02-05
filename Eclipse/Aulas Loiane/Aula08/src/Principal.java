
public class Principal {
	
	public static void main(String[] args) {
		int contador = 0;
		int maximo = 10;
		
		while ( contador < maximo ) {
			System.out.println("Valor do Contador: "+ contador);
			contador++;
		}
		System.out.println("-----------------------------------\n");
		contador = 0;
		maximo = 10;
		
		do {
			System.out.println("Valor do Contador: "+ contador);
			contador++;
		}while(contador < maximo);
		
	}
	
}

/*
while (resolver exepressao logica){
	depois realizar comandos dentro do bloco
}


do{
	primeiro vai realizar os comandos dentro do bloco
}while(resolver exepressao logica) 

*/