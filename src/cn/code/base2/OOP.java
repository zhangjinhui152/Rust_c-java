package cn.code.base2;


public class OOP {
	private String m_name;
	private int age;
	
	//构造方法
	//public className （）
	//{
	// }
	public OOP() {
		// TODO 自动生成的构造函数存根
	}
	public OOP(String name,int age) {
		// TODO 自动生成的构造函数存根
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


