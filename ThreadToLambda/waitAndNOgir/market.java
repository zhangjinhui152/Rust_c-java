package waitAndNOgir;

public class market extends Thread
{
	private BAO baozi;
	public market(BAO baozi)
	{

		this.baozi = baozi;
	}

	int count = 0;

	public void run()
	{
		while (true) {
			synchronized (baozi) {
				if (baozi.flag) {
					try {
						baozi.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				baozi.pi = "rose包皮";
				baozi.xian = "韭菜馅";

				++count;
				System.out.println("正在生产-->");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}

				baozi.flag = true;
				baozi.notify();
				System.out.println("妈了个巴子做完了，来吃");

			}
		}
	}
}
