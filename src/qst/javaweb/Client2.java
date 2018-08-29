package qst.javaweb;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.sun.xml.internal.ws.util.ServiceFinder;

public class Client2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc=new Scanner(System.in);
		String str=null;
		while(sc.hasNext()){
			str=sc.nextLine();
			System.out.println(str);
		String path="request_"+str+".txt";	
		File file=new File(path);
		Scanner scf=new Scanner(file);
		StringBuffer scfnr=new StringBuffer();
		while(scf.hasNext()){
			scfnr.append(scf.next());
		}
			Socket soc=new Socket("localhost",6666);
			PrintWriter prw=new PrintWriter(soc.getOutputStream());
			BufferedReader buf=new BufferedReader(new InputStreamReader(soc.getInputStream()));
			prw.println(str+scfnr);
			prw.flush();
			//返回测试报文
		  String fanb=buf.readLine();
		  System.out.println("收到返回报文:"+fanb);
			
			
			
		}

		

	}

}
