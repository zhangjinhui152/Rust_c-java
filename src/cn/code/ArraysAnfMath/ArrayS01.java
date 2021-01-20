package cn.code.ArraysAnfMath;
import java.util.Arrays;

public class ArrayS01 {
//与数组有关的数据 提供大量的静态方法 实现常用操做
	public static void main(String[] args) {
		int[] i1 = {3,21,10,23,34};
		
		Arrays.sort(i1);
		//默认排序数字从小到大
		
		String s1 = Arrays.toString(i1);
		System.out.println(s1);//数组转换为字符串
		
		String[] a2 = {"ddd","bbb","ccc"};
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));//默认排序按照字母升序
		//自定义类型要co'mparable接口的支持
		

		
	}
}
