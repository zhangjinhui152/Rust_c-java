package APisource;
//public default void funds 
public interface Default {
	public void fun1();
	
	public default void fun2() {
		System.out.println("je");
		//默认方法会被继承和重写
	}
	
	public static void funs3() {
		System.out.println("hello");
		//静态方法
	}
	public static final int NUM =10;
	//final不可改变
	
}
