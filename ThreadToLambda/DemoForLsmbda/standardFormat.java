package DemoForLsmbda;

public class standardFormat
{
	public static void main(String[] args)
	{
		show01();
		show02();
	}

	private static void show02()
	{
		// TODO �Զ����ɵķ������
		invcook(()->{System.out.println("nihao!");});
	}

	public static void show01()
	{
		
		
		
		invcook(new cook()
		{
			@Override
			public void cooking()
			{
				// TODO �Զ����ɵķ������
				System.out.println("cook");
			}
		});

	}

	public static void invcook(cook cook)
	{
		cook.cooking();
	}
}
