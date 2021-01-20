package cn.code.aboutstatic;

public class Static04 {
		public static void main(String[] args)
		{
			static03menonh s1 = new static03menonh();
			s1.m1();
			static03menonh.M2();//静态方法直接类名调用
			
			//静态代码块
			//一次性对静态变量赋值 优先
			Staticcodeblock s3= new Staticcodeblock();
			Staticcodeblock s4= new Staticcodeblock();
			
			

}
}
