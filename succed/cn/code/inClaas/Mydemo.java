package cn.code.inClaas;

//ֻҪ�����ӿ�ʵ��������Ҫʹ��һ�Σ�����ʡ�����壬ʹ�������ڲ�����
public class Mydemo
{
	public static void main(String[] args)
	{
		MyInfet M1 = new MyinfetImp(); // ��̬
		M1.Me1();

		MyInfet M2 = new MyInfet()
		{
			@Override
			public void Me1()
			{
				// TODO �Զ����ɵķ������
				System.out.println("hello");
			}// �����ಿ��
		};

		M2.Me1();
	}
}
