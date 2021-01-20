package cn.code.base2;

import java.util.Arrays;

public class array {
	public static void main(String[] args) {
		// 动态 指定长度
		// 数据类型【】 数组名称 = new 数据类型（数据长度）；
		int[] numA = new int[10];

		// 静态 指定内容
		int[] numB = new int[] { 1, 2, 3, 4, 5, 5, 5 };
		// 自动推算
		String[] charA = new String[] { "hello", "c++yes" };
		// 格式省略
		// 省掉后面的new 数据类型
		int[] arrayA = { 1, 2, 3 };
		System.out.println(arrayA[1]);
		/*
		 * 默认 int = 0 double = 0.0 char = '\u0000' bool = false
		 * 
		 */
		arrayA[1] = 2;
		int temp;
		int[] arrayB = arrayA;// a改变时b也改变；
		System.out.println(arrayA.length);

		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[0] < arrayA[i]) {
				temp = arrayA[i];
				arrayA[i] = arrayA[0];
				arrayA[0] = temp;
			}
		}

		System.out.println(arrayA[0]);

		for (int time = 0; time < arrayA.length; time++) {
			System.out.println(arrayA[time]);
		}

		// 冒泡排序
		
		for (int a = 0; a < arrayA.length; a++) {
			for (int b = a; b < arrayA.length - 1 - a; b++) {
				if (arrayA[b] < arrayA[b + 1]) {
					temp = arrayA[b];
					arrayA[b] = arrayA[b + 1];
					arrayA[b + 1] = temp;
				}

			}
		}
		for (int time = 0; time < arrayA.length; time++) {
			System.out.println(arrayA[time]);
		}

		arrayPrint(arrayA);
		System.out.println(arrayA[2]);
		
	}

	public static void arrayPrint(int[] ar) {
		System.out.println(ar[2]);
	}
	public static int[] arrayreturn(int[] ar) {
		ar[2] += 2;
		return ar;
	}
	int[] ar1 = {1,2,3,4,5};
	//System.out.println(Arrays.toString(ar1));
}
