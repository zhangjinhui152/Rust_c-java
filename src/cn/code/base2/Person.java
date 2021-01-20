package cn.code.base2;

public class Person {
	private String m_nameString;
	private int m_age;
	public String getM_nameString() {
		return m_nameString;
	}
	public void setM_nameString(String m_nameString) {
		this.m_nameString = m_nameString;
	}
	public int getM_age() {
		return m_age;
	}
	public void setM_age(int m_age) {
		this.m_age = m_age;
	}
	public Person(String m_nameString, int m_age) {
		
		this.m_nameString = m_nameString;
		this.m_age = m_age;
	}
	
}
