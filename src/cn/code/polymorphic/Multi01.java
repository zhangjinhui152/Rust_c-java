package cn.code.polymorphic;



public class Multi01 {
//     父类引用 指向子类对象

	// 父类名称 对象 = new 子类名称（）
	public static void main(String[] args) {
		Fa obj = new Son();
		obj.funs();
		System.out.println(obj.num);
		obj.Show();//方法属于谁就用谁
		//以上全是向上转型 也就是多态 一定是安全的 同时不能调用子类的内容
		
		//下面是向下转型
		//子类名称 obj = （子类名称）父类对象
		((Son) obj).fuunsSp();
		Son obj1 = (Son)obj;
		obj1.fuunsSp();
		
		if (obj instanceof Son2) {
			Son2 obj2 = (Son2)obj;
		}
		
		
		
	}
}
