/*
 * 		Aula 12 - Matrizes
 */

public class Principal {

	public static void main(String[] args) {
		double[][] notasAlunos = new double[10][4];
		int i = 0, j = 0;
		
		
		//Populando a matriz bi-dimensional:
		for(i = 0; i < notasAlunos.length; i++ ) {
			for(j = 0; j < notasAlunos[i].length; j++) {
				notasAlunos[i][j] = j;
			}
		}
		
		//Imprimindo matriz:
		for (i = 0; i < notasAlunos.length; i++) {
			for (j = 0; j < notasAlunos[i].length ; j++) {
				System.out.println("Aluno: "+(i+1)+" Nota: "+notasAlunos[i][j]);
			}
		}
		
		
	}
	
}
