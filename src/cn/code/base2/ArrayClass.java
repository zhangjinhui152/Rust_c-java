package cn.code.base2;
//�������������

public class ArrayClass {
	public static void main(String[] args) {
		//��������
		Person[] array = new Person[3];
		
		Person one = new Person("hello1",12);
		Person two = new Person("hello21",12);
		Person three = new Person("hello321",12);
		
		array[0] = one;
		array[0] = two;
		array[0] = three;
		
		System.out.print(array[0].getM_nameString());
		//һ������ ���Ȳ��ܸı䣻
	}
}
