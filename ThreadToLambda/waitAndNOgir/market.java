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
				baozi.pi = "rose��Ƥ";
				baozi.xian = "�²���";

				++count;
				System.out.println("��������-->");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}

				baozi.flag = true;
				baozi.notify();
				System.out.println("���˸����������ˣ�����");

			}
		}
	}
}
