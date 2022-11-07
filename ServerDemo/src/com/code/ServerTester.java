package com.code;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class ServerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InetAddress obj;
		
		 try (Scanner sc=new Scanner(System.in);ServerSocket server=new ServerSocket(5052);){
			System.out.println(" Ip Address :"+InetAddress.getLocalHost().getHostAddress());
			System.out.println("This is server ------------");
			Socket socket=server.accept();
			
			System.out.println("Server is listening");
			System.out.println("----------Connected--------------------- -");
			
			DataInputStream din=new DataInputStream(socket.getInputStream());
			DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
			
			
		String 	str1="";
		String str2="";
		
		while(!str2.equals("Stop")) {
			
			str2=din.readUTF();
			System.out.println("Client said:"+str2);
			
			str1=sc.nextLine();
			dout.writeUTF(str1);
		}
		
		
			
			
			
			
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
