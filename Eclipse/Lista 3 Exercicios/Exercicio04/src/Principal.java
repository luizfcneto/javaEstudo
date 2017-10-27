
/*
 * 	Exercicio 4
 * 	Autor: Luiz Fernando (luizfcneto)
 * 	Email: luizfcneto123@gmail.com	
 * 	Descrição: Calcular quando a quantidade de 
 * 	habitantes da cidade B passa A
 * 	Entrada: nenhuma
 * 	Saida:	anos em que a cidade B passa em A 
 * 
 */

public class Principal {

	public static void main(String[] args) {
		int populacaoA = 80000;
		int populacaoB = 200000;
		double taxaCrescimentoA = 1.03;
		double taxaCrescimentoB = 1.0015;
		int ano = 0;
		while (populacaoB > populacaoA ) {
			populacaoB = (int) (taxaCrescimentoB  * populacaoB);
			populacaoA = (int) (taxaCrescimentoA * populacaoA);
			ano++;
		}
		System.out.println("Anos necessários para A passar B: " + ano );
	
	}
	
}
