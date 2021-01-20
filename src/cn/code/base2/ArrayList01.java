package cn.code.base2;
import java.util.ArrayList;


public class ArrayList01 {
	public static void main(String[] args) {
		//只能引用类型不能基本类型
		ArrayList<String> list1 = new ArrayList<>();
		//jdk 1.7
		//右侧尖括号可以不写但是本身要写出来
		//打印的是内容不是地址
		list1.add("1");
		//常用方法
		//add public boolean add(E e);
		//public E get(int index);
		//remove (int index);
		//size();
		
		boolean a = list1.add("hello");
		//对于其他集合来说不一定成功 这个返回值很有必要
		System.out.print(list1);
		System.out.println(a);
		
		//获取某个
		String name = list1.get(1);
		System.out.println(name);
		
		//删除
		String whoreString = list1.remove(1);
		System.out.println("is remove " +whoreString);
		System.out.println(list1);
		
		//获取长度
		int size = list1.size();
		System.out.println(size);
	}
}
