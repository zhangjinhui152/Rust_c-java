package cn.code.base2;

public class studen {
	private String m_name;
	private int age;
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public studen(String m_name, int age) {
		super();
		this.m_name = m_name;
		this.age = age;
		s12();
	}
	public void s12() {
		System.out.println("hello");
	}

}
