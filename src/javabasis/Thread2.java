package javabasis;

public class Thread2 {
	
	static class  A implements Runnable
	{
		public void run()
		{
			for (int a=0;a<10;a++)
			{
				//System.out.println("AAAA");
				System.out.printf("%s在执行\n",Thread.currentThread().getName());
			}
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		//aa.start();
		
		Thread t = new Thread(aa);
		t.setName("线程2");
		t.start();
		for (int a=0;a<10;a++)
		{
			//System.out.println("BBBB");
			System.out.printf("%s在执行 "+a+"\n",Thread.currentThread().getName());
			//获取当前进程名
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
