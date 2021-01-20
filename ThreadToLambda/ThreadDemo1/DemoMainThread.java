package ThreadDemo1;

public class DemoMainThread
{
	public static void main(String[] args)
	{

//		show02();
//		show03();
//		show04();
		show05();

	}

	public static void show05()
	{

		new Thread()
		{
			public void run()
			{
				for (int i = 1; i != 10; i++) {
					System.out.println("hello" + this.getName());
				}
			}
		}.start();

		DemoRunBer r = new DemoRunBer()
		{
			@Override
			public void run()
			{
				for (int i = 1; i != 10; i++) {
					System.out.println("hello");
				}
			}
		};
		new Thread(r).start();

		new Thread(new DemoRunBer()
		{
			@Override
			public void run()
			{
				for (int i = 1; i != 10; i++) {
					System.out.println("hello");
				}
			}
		}).start();

	}

	public static void show04()
	{
		DemoRunBer p = new DemoRunBer();

		Thread t = new Thread(p);// 往thead 构造函数扔runber对象

		t.start();

	}

	public static void show03()
	{
		new DemoThreadName("MONEYhOCK").start();
	}

	public static void show02()
	{
		DEmoGetnmae getname = new DEmoGetnmae();
		getname.start();
	}

	public static void show01()
	{
		Demo1ThreadCreat t1 = new Demo1ThreadCreat();
		Demo1ThreadCreat t2 = new Demo1ThreadCreat();

		t1.run();
		t2.run();
//		https://programming-idioms.org/about#about-block-cheatsheets
//			2. https://www.thoughtworks.com/cn/radar
//			3. https://www.libhunt.com
//			4. https://tech.meituan.com
//			5. http://mysql.taobao.org/monthly/
	}
}
