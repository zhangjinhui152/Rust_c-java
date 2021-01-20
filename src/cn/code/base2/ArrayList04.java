package cn.code.base2;

import java.util.ArrayList;

public class ArrayList04 {
	public static void main(String[] args) {
		ArrayList<studen> s1 = new ArrayList<studen>();
		

		studen s2 = new studen("man1", 12);
		studen s3 = new studen("man1", 12);
		studen s4 = new studen("man1", 12);
		studen s5 = new studen("man1", 12);
		
		s1.add(s2);
		s1.add(s3);
		s1.add(s4);
		s1.add(s5);
		
		for(int i = 0;i < s1.size();i++)
		{
			studen s6 = s1.get(i);
			System.out.println(s6.getAge());
		}
	}
}
