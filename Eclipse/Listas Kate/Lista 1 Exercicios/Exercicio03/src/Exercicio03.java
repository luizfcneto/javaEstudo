/*
        Exercicio 03
    Autor: Luiz Fernando (luizfcneto)
    Email: Luizfcneto123@gmail.com
    Descrição: imprimir a idade do usuario daqui a 5 anos
    Entrada: idade
    Saida: idade + 5
 */
import java.util.Scanner;
public class Exercicio03 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int age = entrada.nextInt();
        age += 5;
        System.out.println("Idade :"+age);
    }

}

