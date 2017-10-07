public class MinhaThreadRunnable implements Runnable{
	
	private String nome;
	private ArrayList numeros;
	public int numeroNovo;
	
	public MinhaThreadRunnable(String nome, int numero) {
		this.nome = nome;
		this.numeroNovo = numero;
		new Thread(this,nome).start();
	}



	public void run(){
		System.out.println("Começo da Thread: "+ nome);
		testAreaCritica();
		setAreaCritica();
		System.out.println("Termino da Thread: "+nome);
	}


	public void testAreaCritica() {
		if(nome.equals("Thread #1")) {
			this.areaCritica = true;
		}else {
			this.areaCritica = false;
		}
		
	}

	public synchronized void setAreaCritica() {
		if(areaCritica) {
			numeros.add(numeroNovo);
			System.out.Println("Numero: "+ numeroNovo+ "Adicionado na lista pela Thread: " + nome );
			
		} 
	}

}