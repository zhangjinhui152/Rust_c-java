package APisource;

public class defaultImpl implements Default {

	@Override
	public void fun1() {
		// TODO �Զ����ɵķ������
		System.out.println("print->");
		me();
	}

	@Override
	public void fun2() {
		// TODO �Զ����ɵķ������
		Default.super.fun2();
		System.out.println("jianrern");
		me();
	}
	private void me() {
		System.out.println("me");
	}
	
}
