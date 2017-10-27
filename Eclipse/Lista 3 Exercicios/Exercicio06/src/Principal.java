/*
 * 		Exercicio 6
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: luizfcneto123@gmail.com
 * 	Descrição: Imprimir numeros na tela de 1 a 20
 * 	 um abaixo do outro depois um do lado do outro
 * 	Entrada: NULL
 * 	Saida: NULL
 * 	 
 * 
 */
public class Principal {

	public static void main(String[] args) {
		int contador = 1;
		
		//Um embaixo do outro
		for(; contador <= 20; contador++ ) {
			System.out.println(contador);
		}
		
		//Um do lado do outro
		for(contador = 1; contador <= 20; contador++) {
			System.out.print(contador + " ");
		}
	}
	
}
