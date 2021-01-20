package cn.code.succeed.reabag;

import java.util.ArrayList;

public class demo {
	public static void main(String[] args) {
		Manger M1 = new Manger("群主",1000);
		Mamber p1 = new Mamber("闲散人员",0);
		Mamber p2 = new Mamber("闲散人员",0);
		Mamber p3 = new Mamber("闲散人员",0);
		
		
		M1.show();
		p1.show();
		p2.show();
		
		
		ArrayList<Integer> redList = M1.send(100, 6);
		
		p1.recetive(redList);
		p2.recetive(redList);
		p3.recetive(redList);
		
		M1.show();
		p1.show();
		p2.show();
		
		
	}
}
