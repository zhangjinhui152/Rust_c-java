package cn.code.base2;

public class OOP2 {
	//����
	//����   ������/����
	//ͬһ�������õ���
	
//������ ������ = new �����ƣ���
	public static void main(String[] args) {
	OOP o1 = new OOP("man",22);
	o1.eat();
	funs1(o1);
	o1.Show();
	o1.SetName("hello");
	o1.Show();
	new OOP().Show();
	//��������
	
	}
	
	public static void funs1(OOP o1) {
	o1.eat();
}
}