package cn.code.base2;
import java.util.ArrayList;
public class ArrayList02 {
	//使用基本类型的包装类
	//首字母大写
	//除 char  Character
	//int integer;
	
	public static void main(String[] args) {
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(100);
		list3.add(100);
		list3.add(100);
		System.out.println(list3);
		
		int num1 = list3.get(1);//自动拆箱 到   装箱；
		System.out.println(num1);
		
	}

}
