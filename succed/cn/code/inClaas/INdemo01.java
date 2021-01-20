package cn.code.inClaas;

public class INdemo01 {
public static void main(String[] args) {
	Inclass01 i1 = new Inclass01();
	i1.M1();
	Inclass01.Dokidoki i2 = new Inclass01().new Dokidoki();//直接创建内部对象
	i2.beat();
	
	i2.M2();
}
}
