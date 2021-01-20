package ThreadDemo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DemoLock implements Runnable
{
	int ticket = 100;
	Lock l = new ReentrantLock();

	@Override
	public void run()
	{

		while (true) {
			l.lock();
			// TODO 自动生成的方法存根
			if (this.ticket > 0) {
				System.out.println(Thread.currentThread().getName()+"买票---->" + this.ticket);
				this.ticket--;
				l.unlock();
			} else {
				break;
			}
		}

	}
}
