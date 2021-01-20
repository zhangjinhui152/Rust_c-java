package cn.code.base2;

public class three
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 28;
		int c = 30;
		int e = 40;
		int d = 0;
		int f = 0;
		int max;

		max = a < b ? b : a;
		
		System.out.println(max);
		max = d<f ?(f = b<c?b:c):(d = a<e?e:a);
		System.out.println(max);
	}
}
