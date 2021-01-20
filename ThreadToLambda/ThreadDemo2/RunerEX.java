package ThreadDemo2;

public class RunerEX implements Runnable
{
	int ticket = 100;

	@Override
	public void run()
	{
		while (true) {
			// TODO 自动生成的方法存根
			if (this.ticket > 0) {
				System.out.println("买票---->" + this.ticket);
				this.ticket--;
			}
			else {
				break;
			}
			
			
		}
	}

}
