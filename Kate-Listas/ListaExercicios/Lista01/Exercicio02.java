package Lista01;

/*
        Exercicio 02
    Autor: Luiz Fernando (luizfcneto)
    Email: Luizfcneto123@gmail.com
    Descrição: Perguntar a idade do usuario e imprimi-la
    Entrada: Idade
    Saida: Idade
*/
import java.util.Scanner;
public class Exercicio02 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int age = entrada.nextInt();
        System.out.println("Idade :"+age);
		entrada.close();    
	}

}
