package cn.code.succeed.reabag;

import java.util.ArrayList;
import java.util.Random;

public class Mamber extends User{
	public Mamber() {
		// TODO 自动生成的构造函数存根
	}

	public Mamber(String name, int money) {
		super(name, money);
		// TODO 自动生成的构造函数存根
	}@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO 自动生成的方法存根
		return super.clone();
	}
	public void recetive(ArrayList<Integer> list) {
		
		int index = new Random().nextInt(list.size());
		int delta  = list.remove(index);
		int money = super.getMoney();
		
		super.setMoney(money+delta);
	}
	
}
