package ThreadDemo2;

public class SyncFunction implements Runnable
{
	int ticket = 100;
	public void run()
	{
		while(true)
		{
			show();
		}
	}

	public  synchronized void show()
	{
		synchronized (this) {
			if (ticket>0) {
				--ticket;
				System.out.println("-->"+ticket);
			}
			
		}
		
	}
	public static synchronized void name()
	{
		
	}
}
