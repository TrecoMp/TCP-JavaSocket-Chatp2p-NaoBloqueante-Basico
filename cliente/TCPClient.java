package cliente;

import java.net.*;

import util.Envia;
import util.Recebe;

import java.io.*;
public class TCPClient {
	
	
	public static void main (String args[]) {
	// arguments supply message and hostname of destination
	Socket s = null;
	    try{
	    	int serverPort = 7896;
		   	s = new Socket("127.0.0.1", serverPort);
		   	Envia envia = new Envia(s);
		   	Recebe recebe = new Recebe(s);
		   	
	    } catch (IOException e){ System.out.println("IO:"+e.getMessage());
		}
  	}
}
