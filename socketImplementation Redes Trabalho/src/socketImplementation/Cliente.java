package socketImplementation;

import java.net.Socket;
import java.io.*;

public class Cliente {

	public static void main( String[] args ) {
		
		System.out.println( "Aguardando conexão com Servidor... " );
		int porta = 3030, contador = 5; // contador = quantidade de mensagens que o cliente vai enviar ao servidor
		
		//instanciando um cliente
		try{
			Socket cliente = new Socket( "localhost" , porta );
			System.out.println( "Conexão estabelecida \nInformações: \n"
					+ "Porta: " + cliente.getLocalPort() 
					+ "\nEndereço: " + cliente.getLocalAddress() );
			
			while ( contador >= 0 ) {
				//Envio de uma mensagem para o servidor
				enviaMensagemCliente( cliente );
				
				
				//Receber mensagem do Servidor:
				recebeMensagemServidor( cliente );
				
				contador--;
			} 
					
			//fechamentos
			cliente.close();
			
		}catch ( Exception e ){
			e.printStackTrace();
		
		}
		
		
	}
	
	//Metodo estático para enviar mensagem do cliente para o servidor
	public static void enviaMensagemCliente( Socket cliente ) {
		String mensagem;
		
		//Armazena do teclado ( System.in ) a mensagem que irá ser enviada pelo socket do cliente
		BufferedReader entradaCliente = new BufferedReader ( new InputStreamReader( System.in ) ) ;
		System.out.println("Escreva a mensagem que deseja enviar ao servidor: ");
		
		try {
			//Pega a mensagem que o cliente deseja enviar ao servidor, pelo teclado
			mensagem = entradaCliente.readLine();
			
			//Para enviar a mensagem utilizamos a classe PrintWriter com os atributos de envio do cliente e um booleano confirmando
			PrintWriter envio = new PrintWriter( cliente.getOutputStream() , true );		
			envio.println( mensagem );
			
		}catch ( Exception e ) {
			e.printStackTrace();
		
		}

	}
	
	//Método estático para receber a mensagem replicada do Servidor
	public static void recebeMensagemServidor( Socket cliente ) {
		
		try {
			
			//Diferente do método de envio que pegávamos a mensagem do teclado, no recebimento pegamos a mensagem enviado através do socket do servidor
			BufferedReader recebimentoServidor = new BufferedReader( new InputStreamReader( cliente.getInputStream() ) );
			System.out.println( recebimentoServidor.readLine() );
			
		}catch ( Exception e ) {
			e.printStackTrace();
		}
		
	}
	
}
