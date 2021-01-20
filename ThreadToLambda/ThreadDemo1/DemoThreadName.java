package ThreadDemo1;

public class DemoThreadName extends Thread
{
	
	public DemoThreadName(String name) {
		super(name);
	}
	
	@Override
	public void run()
	{
		// TODO 自动生成的方法存根
		for(int i = 0;i !=10;++i)
		{
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
