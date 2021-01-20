package cn.code.base2;
//定义数储存对象

public class ArrayClass {
	public static void main(String[] args) {
		//创建数组
		Person[] array = new Person[3];
		
		Person one = new Person("hello1",12);
		Person two = new Person("hello21",12);
		Person three = new Person("hello321",12);
		
		array[0] = one;
		array[0] = two;
		array[0] = three;
		
		System.out.print(array[0].getM_nameString());
		//一旦创建 长度不能改变；
	}
}
