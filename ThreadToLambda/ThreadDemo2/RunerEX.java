package ThreadDemo2;

public class RunerEX implements Runnable
{
	int ticket = 100;

	@Override
	public void run()
	{
		while (true) {
			// TODO �Զ����ɵķ������
			if (this.ticket > 0) {
				System.out.println("��Ʊ---->" + this.ticket);
				this.ticket--;
			}
			else {
				break;
			}
			
			
		}
	}

}
