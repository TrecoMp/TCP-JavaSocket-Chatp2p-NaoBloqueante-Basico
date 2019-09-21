package servidor;
import java.net.*;

import util.Envia;
import util.Recebe;

import java.io.*;

public class TCPServer {
    public static void main (String args[]) {
	try{
		int serverPort = 7896; 
		ServerSocket listenSocket = new ServerSocket(serverPort);
		while(true) {
			Socket clientSocket = listenSocket.accept();
			Recebe c = new Recebe(clientSocket);
			Envia l = new Envia(clientSocket); 
		}
	} catch(IOException e) {System.out.println("Listen :"+e.getMessage());}
    }
}
