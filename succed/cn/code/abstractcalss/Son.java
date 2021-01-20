package cn.code.abstractcalss;

public class Son extends Animal{
	@Override
	public void Eat()
	{//super();
		System.out.println("鱼");
	}
}

//子类是个抽象类要孙子类 包含 子类已经写好的具体方法 孙子类可以调用；
