import java.util.Scanner;

public class ContaCorrente{
	
	int numero = 111;
	double saldo = 1000,00;
	boolean especial = false;
	double limite = 400,00;

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		double saque, deposito;
		System.out.println("Informe a quantia que deseja depositar:");
		deposito = entrada.nextDouble();
		
		depositarDinheiro(deposito);

		System.out.println("Informe a quantia que deseja sacar:");
		saque = entrada.nextDouble();
		sacarDinheiro(saque);

		verificaEspecial();

	}	

	public void sacarDinheiro(double saque){
		if (saque > this.limite){
			System.out.println("Erro, limite estourado!");

		}else{
			if (saque > this.saldo && saque < 0){
				System.out.println("Erro ao Sacar, tente novamente");

			} else {
				this.saldo -= saque;
				System.out.println("Saque realizado com sucesso!");

			}
		}
		
	}

	public void depositarDinheiro(double deposito){
		this.saldo += deposito;
		System.out.println("deposito realizado com sucesso!");
	}

	public void consultarSaldo(){
		System.out.println("Saldo Atual: "+this.saldo);
	}

	public int verificaEspecial(){
		if(!(this.especial)){
			System.out.println("Pessoa nao autorizada!");
		}else {
			System.out.println("Pessoa Autorizada!");
		}
	}

}