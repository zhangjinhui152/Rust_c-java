package cn.code.base2;

public class OOP2 {
	//导包
	//导入   包名称/类名
	//同一个包不用导入
	
//类名称 对象名 = new 类名称（）
	public static void main(String[] args) {
	OOP o1 = new OOP("man",22);
	o1.eat();
	funs1(o1);
	o1.Show();
	o1.SetName("hello");
	o1.Show();
	new OOP().Show();
	//匿名函数
	
	}
	
	public static void funs1(OOP o1) {
	o1.eat();
}
}