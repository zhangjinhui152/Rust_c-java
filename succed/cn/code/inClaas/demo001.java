package cn.code.inClaas;

public class demo001
{
public static void main(String[] args)
{
	Hero h1 = new Hero();
	h1.setName("hello");
	wapon w1 = new wapon("kille11");
	
	h1.setW1(w1);
	h1.attack();
}
}
