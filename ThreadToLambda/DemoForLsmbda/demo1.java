package DemoForLsmbda;

public class demo1
{
	public static void main(String[] args)
	{
		new Thread(()->{System.out.println("hello");});
	}
}
