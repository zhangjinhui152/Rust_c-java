package ThreadDemo2;

public class Main
{
	public static void main(String[] args)
	{
		show04();
		
		
		
		
		
	}
	
	private static void show04()
	{
		// TODO 自动生成的方法存根
DemoLock run  = new DemoLock();
		
		new Thread(run).start();
		new Thread(run).start();
		new Thread(run).start();
	}

	public static void show03()
	{
		SyncFunction run  = new SyncFunction();
		
		new Thread(run).start();
		new Thread(run).start();
		new Thread(run).start();
		
	}
	
	
	
	
	public static void show02()
	{
		synychrized run = new synychrized();
		new Thread(run).start();
		new Thread(run).start();
		new Thread(run).start();
	}
	
	
	
	
	
	public static void show01()
	{
		new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				System.out.println("ssss");
				
			}
		}).start();
	}
}
