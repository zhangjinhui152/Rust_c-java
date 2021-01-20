package cn.code.inClaas;

public class Hero
{
	private String name;
	private int age;
	private wapon w1;
	
	
	public Hero(String name, int age, wapon w1)
	{
		super();
		this.name = name;
		this.age = age;
		this.w1 = w1;
	}
public Hero()
{
	// TODO 自动生成的构造函数存根
}
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public wapon getW1()
	{
		return w1;
	}

	public void setW1(wapon w1)
	{
		this.w1 = w1;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	public void attack()
	{
		System.out.println("kora!!!"+w1.getCode());
	}
}
