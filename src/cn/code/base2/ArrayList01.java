package cn.code.base2;
import java.util.ArrayList;


public class ArrayList01 {
	public static void main(String[] args) {
		//ֻ���������Ͳ��ܻ�������
		ArrayList<String> list1 = new ArrayList<>();
		//jdk 1.7
		//�Ҳ�����ſ��Բ�д���Ǳ���Ҫд����
		//��ӡ�������ݲ��ǵ�ַ
		list1.add("1");
		//���÷���
		//add public boolean add(E e);
		//public E get(int index);
		//remove (int index);
		//size();
		
		boolean a = list1.add("hello");
		//��������������˵��һ���ɹ� �������ֵ���б�Ҫ
		System.out.print(list1);
		System.out.println(a);
		
		//��ȡĳ��
		String name = list1.get(1);
		System.out.println(name);
		
		//ɾ��
		String whoreString = list1.remove(1);
		System.out.println("is remove " +whoreString);
		System.out.println(list1);
		
		//��ȡ����
		int size = list1.size();
		System.out.println(size);
	}
}
