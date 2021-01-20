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
		// TODO 自动生成的方法存根
		invcook(()->{System.out.println("nihao!");});
	}

	public static void show01()
	{
		
		
		
		invcook(new cook()
		{
			@Override
			public void cooking()
			{
				// TODO 自动生成的方法存根
				System.out.println("cook");
			}
		});

	}

	public static void invcook(cook cook)
	{
		cook.cooking();
	}
}
