package cn.code.base2;

import java.util.Scanner;

public class Hide {
	public static void main(String[] args) {
		
		ScHide(new Scanner(System.in));
		Scanner sc = retuenScanner();
		
		int a = sc.nextInt();
		System.out.println(a);
	}
	//������������
	
	public static void ScHide(Scanner sc) {
		int a = sc.nextInt();
		System.out.println(a);
		
	}
	
	//����ֵ ���ظ��زġ�
	
	public static Scanner retuenScanner() {
		return new Scanner(System.in);
		
	}
}
