package cn.code.ArraysAnfMath;
import java.util.Arrays;

public class ArrayS01 {
//�������йص����� �ṩ�����ľ�̬���� ʵ�ֳ��ò���
	public static void main(String[] args) {
		int[] i1 = {3,21,10,23,34};
		
		Arrays.sort(i1);
		//Ĭ���������ִ�С����
		
		String s1 = Arrays.toString(i1);
		System.out.println(s1);//����ת��Ϊ�ַ���
		
		String[] a2 = {"ddd","bbb","ccc"};
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));//Ĭ����������ĸ����
		//�Զ�������Ҫco'mparable�ӿڵ�֧��
		

		
	}
}
