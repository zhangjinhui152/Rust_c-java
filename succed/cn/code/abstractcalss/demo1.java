package cn.code.abstractcalss;

public class demo1 {
	//不能直接 new 一个抽象类
	//用子类覆盖重写父类去掉关键字补上{}
	
	public static void main(String[] args) {
		
		Son s1 = new Son();
		s1.Eat();
	}
}
