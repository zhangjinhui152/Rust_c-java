package APisource;

public class Demo01 {
public static void main(String[] args) {
	DemoImpl D1 = new DemoImpl();
	D1.methon();
	
	defaultImpl d1 = new defaultImpl();
	d1.fun1();
	d1.fun2();
	
	//ͨ���ӿ����Ƶ��÷���
	Default.funs3();
}
}
