package APisource;

public class defaultImpl implements Default {

	@Override
	public void fun1() {
		// TODO 自动生成的方法存根
		System.out.println("print->");
		me();
	}

	@Override
	public void fun2() {
		// TODO 自动生成的方法存根
		Default.super.fun2();
		System.out.println("jianrern");
		me();
	}
	private void me() {
		System.out.println("me");
	}
	
}
