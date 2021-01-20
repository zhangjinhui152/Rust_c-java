package cn.code.base2;

public class overload {
	public static void main(String[] args) {
		
	}
	public static void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void sum(int a,int b) {
		System.out.println(a+b);
	}	public static void sum(int a,int b,int c ,int d) {
		System.out.println(a+b+c+d);
	}
	//参数顺序不同也行
}
