package javabasis;

public class Thread1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		aa.start();  //调用aa的start方法，start方法会创建一个新进程，并自动调用run方法
		
//		aa.stop();
		while(true){
			System.out.println("线程a");
			//发送 GET 请求
//	        String s=HttpRequest.sendGet("http://112.74.165.209:3020", "key=123&v=456");
//	        System.out.println(s);
			}
		}
	}
	class A extends Thread{
		public void run(){
			//int a=0;
			while(true){
				//a++;
				System.out.println("线程b");
				
		        //发送 POST 请求
//		        String sr=HttpRequest.sendPost("http://112.74.165.209:3020", "key=123&v=456");
//		        System.out.println(sr);
				
		}
	}
}