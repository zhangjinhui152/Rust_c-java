package DemoForLsmbda;

public class Minimalist
{
	public static void main(String[] args)
	{
		new Thread(()->{System.out.println("nihao");}).start();
		
		new Thread(()->System.out.println("nihao")).start();//ʡ��{}�ͣ�����һ�д���
	}
}
