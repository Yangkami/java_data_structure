package javabasis;

public class Thread2 {
	
	static class  A implements Runnable
	{
		public void run()
		{
			while (true)
			{
				System.out.println("AAAA");
			}
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		//aa.start();
		
		Thread t = new Thread(aa);
		t.start();
		while (true)
		{
			System.out.println("BBBB");
		}
	}
	

}
