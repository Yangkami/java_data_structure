package qst.javaweb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import com.sun.swing.internal.plaf.synth.resources.synth_pt_BR;

public class Server2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		ServerSocket sesk=new ServerSocket(6666);
		

		Socket sock=null;
		PrintWriter prw=null;
		BufferedReader bufr=null;
		StringBuffer stb=new StringBuffer();
		while (true) {
			sock=sesk.accept();
			bufr=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			PrintWriter printWriter=new PrintWriter(sock.getOutputStream());
			String str=bufr.readLine();
			String str2=str.substring(0, 4);
			String path="response"+str2+".txt";
			Scanner sc=new Scanner(path);
			while(sc.hasNext()){
				stb.append(sc.nextLine());
				
			}
			//收到前端报文请求	
			System.out.println(str);
			prw.println(sock.getOutputStream());
			prw.flush();
		}
		
			
	}

}
