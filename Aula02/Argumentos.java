class Argumentos {
	//args = argumentos passados pelo terminal ao executar o programa
	public static void main (String[] args) {
		//printa o primeiro argumento, nesse caso a primeira palavra apos a execução do programa no terminal
		System.out.println ("Você digitou " + args[0]);
	}

}


/*
Exemplo:
	>javac Argumentos.java
	>java Argumentos "tudo que eu digitei aqui"

*/