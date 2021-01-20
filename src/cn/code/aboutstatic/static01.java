package cn.code.aboutstatic;

public class static01 {
	//共享同一份天空
	private String name;
	private int age;
	 int id;
	static String romm;
	private static int idCounter = 0;

	public static01(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.id = idCounter++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
