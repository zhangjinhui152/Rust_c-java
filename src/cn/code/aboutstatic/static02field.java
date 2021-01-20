package cn.code.aboutstatic;

public class static02field {
public static void main(String[] args) {
	
	static01 s1 = new static01("name",12);
	static01 s2 = new static01("nam2e",22);
	s2.romm = "hello";
	
	System.out.println(s1.romm);
	System.out.println(s2.id);
	
}
}
