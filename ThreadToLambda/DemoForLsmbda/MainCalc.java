package DemoForLsmbda;

public class MainCalc
{
	public static void main(String[] args)
	{
		show(10, 20, (a,b)->{return a+b;});
	}
	public static void show(int a,int b,Calc c)
	{
		System.out.println(c.CalcAdd(a, b));
	}
}
