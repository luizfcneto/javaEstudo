/*
 * Trabalho 1 - Sistemas Operacionais
 * Autor: Luiz Fernando (luizfcneto)
 * Email: luizfcneto123@gmail.com / luiz.cunha@uniriotec.br
 * 
 * Descrição: Criar um programa em Java que implemente os métodos test and set com no minimo 5 threads 	
 * e executar os métodos add e subtract em uma determinada variavel
 * 
 * 
 * 
 */

public class Principal {

	public static void main(String[] args) {
		
		int numeroRegiaoCritica = 10;
		
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", numeroRegiaoCritica);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", numeroRegiaoCritica);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", numeroRegiaoCritica);
		MinhaThreadRunnable thread4 = new MinhaThreadRunnable("Thread #4", numeroRegiaoCritica);
		MinhaThreadRunnable thread5 = new MinhaThreadRunnable("Thread #5", numeroRegiaoCritica);
		MinhaThreadRunnable thread6 = new MinhaThreadRunnable("Thread #6", numeroRegiaoCritica);
		
		
		
		
		
	}
	
}
