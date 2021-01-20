package cn.code.inClaas;

//只要父类或接口实现类子需要使用一次，可以省掉定义，使用匿名内部定义
public class Mydemo
{
	public static void main(String[] args)
	{
		MyInfet M1 = new MyinfetImp(); // 多态
		M1.Me1();

		MyInfet M2 = new MyInfet()
		{
			@Override
			public void Me1()
			{
				// TODO 自动生成的方法存根
				System.out.println("hello");
			}// 匿名类部类
		};

		M2.Me1();
	}
}
