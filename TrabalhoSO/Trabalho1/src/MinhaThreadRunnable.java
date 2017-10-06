public class MinhaThreadRunnable implements Runnable{

	private String nome;
	private boolean areaCritica = false;
	
	private int numero;
	
	
	public MinhaThreadRunnable (String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		new Thread(this,nome).start();
	}
	
	
	public void run() {
		
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
			numero = numero + 10;
			System.out.println("numero: " + numero +" Executado pela: "+this.nome);
		} 
	}
	
	
}
