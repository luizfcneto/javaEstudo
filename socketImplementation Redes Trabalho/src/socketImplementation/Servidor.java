/*
 * 		Trabalho Final - Redes
 * 	Autor: Luiz Fernando 
 * 	Email: luiz.cunha@uniriotec.br
 * 	Descrição: Criar uma comunicação entre dois clientes através da implementação do Socket.
 *		Neste algoritmo há apenas um cliente enviando requisições " textos " para o servidor e
 * 	este replica a mensagem enviada ao cliente
 *  
 */


package socketImplementation;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;


public class Servidor {

	public static void main( String[] args ) {
		
		//Criando (testando criação) do Servidor na porta 3030
		try {
			String mensagem;
			
			//Para multiplos acessos de cliente ao mesmo servidor, seria necessário Implementar com threads num loop até uma determinada condição 
			ServerSocket servidor = new ServerSocket( 3030 );
			
			
			System.out.println( "Servidor inicializado na porta: " + servidor.getLocalPort() );
			
			System.out.println("Informações sobre o Servidor: \n"
								+ "IP: " + servidor.getInetAddress() 
								+ " Conexão porta: " + servidor.getLocalPort() );
			
			//estabelece conexão com um socket que esteja querendo se comunicar através da porta 3030
			Socket socket = servidor.accept();
			System.out.println( "Conexão estabelecida");
			
			
			while ( socket.isConnected() ) {
				//Receber mensagem do Cliente
				mensagem = recebimentoMensagemCliente( socket ); 
			
				//Imprimir mensagem recebida do Servidor
				respondeCliente( socket, mensagem );
			}
			
			
			//Fechamento do servidor, socket, entrada e saida
			servidor.close();
			socket.close();
			
		}catch( Exception e ) {
			e.getStackTrace();
		
		}
		
	}
	
	public static String recebimentoMensagemCliente( Socket socket ) {
		
		try {
			String mensagem;
			
			BufferedReader entrada = new BufferedReader ( new InputStreamReader ( socket.getInputStream() ) );
			mensagem = entrada.readLine();
			
			return mensagem;
			
		} catch( Exception e ) {
			e.printStackTrace();
			
		}
		return null;
	
	}
	
	//Método estático para o Servidor responder o Cliente
	public static void respondeCliente ( Socket socket, String mensagem ) {
		
		try {
			PrintWriter saida = new PrintWriter( socket.getOutputStream(), true );
			saida.println( "[Servidor]: " + mensagem );									//Imprimir mensagem no terminal do cliente
			
		}catch ( Exception e ) {
			e.printStackTrace();
			
		}
		
	}

}
