package cn.code.base2;


public class OOP {
	private String m_name;
	private int age;
	
	//���췽��
	//public className ����
	//{
	// }
	public OOP() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public OOP(String name,int age) {
		// TODO �Զ����ɵĹ��캯�����
		this.age = age;
		this.m_name = name;
	}
		
	public void eat() {
		System.out.println("huanger");
	}
	
	public void Show() {
		System.out.println(age+m_name);
	}
	
	public void SetName(String sname) {
		this.m_name = sname;
	}
}


