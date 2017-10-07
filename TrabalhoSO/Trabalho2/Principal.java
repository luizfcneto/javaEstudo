/*
 * Trabalho 2 - Sistemas Operacionais
 * Autor: Luiz Fernando (luizfcneto)
 * Email: luizfcneto123@gmail.com / luiz.cunha@uniriotec.br
 * 
 * Descrição: Criar um programa em Java que implemente o algoritmo de paterson com no minimo 5 threads 
 e acessar uma regiao critica para adicionar elementos em uma lista sincronizada
 * 
 * 
 * 
 */
 public class Principal {

 	public static void main(String[] args){
 		int numeros
 		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("Thread #1", numeros);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", numeros);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", numeros);
		MinhaThreadRunnable thread4 = new MinhaThreadRunnable("Thread #4", numeros);
		MinhaThreadRunnable thread5 = new MinhaThreadRunnable("Thread #5", numeros);
		MinhaThreadRunnable thread6 = new MinhaThreadRunnable("Thread #6", numeros);

 	}
 }