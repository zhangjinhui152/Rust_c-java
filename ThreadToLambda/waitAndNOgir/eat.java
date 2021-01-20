package waitAndNOgir;

public class eat extends Thread
{
	private BAO baozi;

	public eat(BAO baozi)
	{

		this.baozi = baozi;
	}

	@Override
	public void run()
	{
		while (true) {
			synchronized (baozi) {
				if (baozi.flag == false) {
					try {
						baozi.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				//被唤醒后的代码
				baozi.flag = false;
				baozi.notify();
				System.out.println("tmd就这？？？？再来");
				
			}
		}
	}
}
