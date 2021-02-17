package Lista07;
/*
 * 		Exercicio03
 * 	Autor: Luiz Fernando (Luizfcneto)
 * 	Email: Luizfcneto123@gmail.com
 * 	Descrição: Classe de Aluno para representar um 
 *    Aluno, adicionando atributos relacionados as 
 *    caracteristicas de um Aluno,
 *    exemplo: Nome, matricula, curso que esta matriculado
 *    nome de 3 disciplinas que está cursando e as notas
 *    dessas 3 disciplinas.
 *    
 *    Desenvolver método para verificar se o aluno está 
 *    aprovado (nota maior ou igual a 7) em uma determinada
 *    disciplina
 * 
 * 	Entrada (Parametros Construtor): Informações do Aluno
 * 		Nome (String),			(name)
 * 		Matricula (int),		(registration)
 * 		Curso q esta matriculado (String),	(course)
 * 		3 disciplinas (String[3]),		(subjects)
 * 		notas (2) em cada disciplina (double)	(grades)
 * 
 * 	Saida (Parametros que usuario quer saber): 
 * 		nome das disciplinas (String),
 * 		nota nas disciplinas (double),
 * 		situação nas disciplinas (Aprovado, Reprovado) (boolean);
 * 
 */

import java.util.Scanner;
public class Aluno {
	String name;
	String course;
	String[] subjects = new String[3];
	int registration;
	double[][] grades = new double[subjects.length][2];
	boolean[] approved = new boolean[subjects.length];
	Scanner scan = new Scanner(System.in);
	
	public Aluno() {
		
		System.out.println("Informe o Nome do Aluno:");
		this.name = scan.nextLine();
		
		System.out.println("Informe o curso em que o Aluno está realizando:");
		this.course = scan.nextLine();
		
		System.out.println("Informe a matricula do Aluno: ");
		try {
			this.registration = Integer.parseInt(scan.nextLine());
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
			
		System.out.println("Informe o nome das 3 disciplinas do aluno e suas duas notas em cada prova em cada disciplina: ");
	
		for(int counterI = 0; counterI < subjects.length; counterI++) {
			System.out.println("Informe a Materia[" + (counterI+1) + "] : ");
			this.subjects[counterI] = scan.nextLine();
			
			
			for(int counterJ = 0; counterJ < grades[counterI].length; counterJ++) {
				System.out.println("Nota["+ (counterJ+1) +"] :");
				this.grades[counterI][counterJ] = scan.nextDouble();
			}
			scan.nextLine();
		}
		
		scan.close();
		
	}
	
	//informa se o aluno foi aprovado ou nao na  disciplina
	public void isApproved() {
		int counterI = 0;
		for (; counterI < grades.length; counterI++) {
			
			if ( ( this.grades[counterI][0] + this.grades[counterI][1] )/2 >= 7)
				approved[counterI] = true;
			else 
				approved[counterI] = false;
		}
	}
	
	
	//printa os dados de saida que o usuario deseja visualizar
	public void printAluno() {
		int counterSubjects = 0;
		int counterGrades = 0;
		
		System.out.println("Nome: "+ this.name);
		System.out.println("Matricula: "+ this.registration);
		System.out.println("Curso: "+ this.course);
		
		isApproved();
		
		for (counterSubjects = 0; counterSubjects < subjects.length; counterSubjects++) {
			
			System.out.println("Disciplina: " + subjects[counterSubjects]);
			
			for (counterGrades = 0; counterGrades < grades[counterSubjects].length; counterGrades++) {
				System.out.println("Nota[" + (counterGrades+1) + "]: " + grades[counterSubjects][counterGrades] );
				
			}
			
			System.out.println("Situação: Aprovado? " + approved[counterSubjects] +"\n" );
			
		}
		
		
	}
	
	
	
}
