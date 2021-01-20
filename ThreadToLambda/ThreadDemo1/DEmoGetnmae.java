package ThreadDemo1;

public class DEmoGetnmae extends Thread
{
	public DEmoGetnmae()
	{
		super();
	}
	@Override
	public void run()
	{
//		String s = this.getName();
//		System.out.println(s);
//		
		
//		Thread t = Thread.currentThread();
//		String tName = t.getName();
//		System.out.println(tName);
		
		System.out.println(Thread.currentThread().getName());
		
	}
	
}
