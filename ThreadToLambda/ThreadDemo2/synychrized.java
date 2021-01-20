package ThreadDemo2;

public class synychrized implements Runnable
{
	int ticket = 100;

	Object obj = new Object();// 🔒对象

	@Override
	public void run()
	{
		while (true) {

			synchronized (obj) {
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
}
