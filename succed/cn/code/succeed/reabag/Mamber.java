package cn.code.succeed.reabag;

import java.util.ArrayList;
import java.util.Random;

public class Mamber extends User{
	public Mamber() {
		// TODO �Զ����ɵĹ��캯�����
	}

	public Mamber(String name, int money) {
		super(name, money);
		// TODO �Զ����ɵĹ��캯�����
	}@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO �Զ����ɵķ������
		return super.clone();
	}
	public void recetive(ArrayList<Integer> list) {
		
		int index = new Random().nextInt(list.size());
		int delta  = list.remove(index);
		int money = super.getMoney();
		
		super.setMoney(money+delta);
	}
	
}
