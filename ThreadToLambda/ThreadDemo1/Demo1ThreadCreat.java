package ThreadDemo1;

public class Demo1ThreadCreat extends Thread
{

	@Override
	public void run()
	{
		// TODO �Զ����ɵķ������
		for (int i = 0;i !=10;i++)
		{
			System.out.println("hello");
		}
	}
	
}
