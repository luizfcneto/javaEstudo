package Lista03;
/*
 * 		Exercicio 2
 * Autor: Luiz Fernando (luizfcneto)
 * Email: luizfcneto123@gmail.com
 * Descrição: Fazer um programa que leia um nome de usuário e 
 * a sua senha e não aceite a senha igual ao nome do usuário,
 * mostrando uma mensagem de erro e voltando a pedir que faça
 * novamente
 * Entrada: String usuario, String senha;
 * Saída: Caso usuario e senha sejam diferentes ok, caso contrario
 * tentar novamente
 * 
 */

import java.util.Scanner;
public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String usuario, senha;
		
		System.out.print("Usuário: ");
		usuario = entrada.next();

		System.out.print("Senha: ");
		senha = entrada.next();
		
		while( usuario.equals(senha) ) {
			System.out.println("Senha incorreta, digite novamente!");
			
			System.out.print("Usuário: ");
			usuario = entrada.next();
			System.out.print("Senha: ");
			senha = entrada.next();
		}
		System.out.println("Logado ");
		
		entrada.close();
	}
	
}
