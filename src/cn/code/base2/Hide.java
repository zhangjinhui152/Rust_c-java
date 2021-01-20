package cn.code.base2;

import java.util.Scanner;

public class Hide {
	public static void main(String[] args) {
		
		ScHide(new Scanner(System.in));
		Scanner sc = retuenScanner();
		
		int a = sc.nextInt();
		System.out.println(a);
	}
	//匿名函数传参
	
	public static void ScHide(Scanner sc) {
		int a = sc.nextInt();
		System.out.println(a);
		
	}
	
	//返回值 返回给素材。
	
	public static Scanner retuenScanner() {
		return new Scanner(System.in);
		
	}
}
