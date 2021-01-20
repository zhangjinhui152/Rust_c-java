package cn.code.base2;
import java.util.ArrayList;
import java.util.Random;
public class ArrayList07 {
	private static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList<Integer> unityBig= new ArrayList<Integer>();
		Random r1 = new Random();
		
		int num;
		
		
		for(int i = 0;i < 20;i++)
		{
			num =r1.nextInt(100);
			unityBig.add(num);
//			System.out.prissssnt(unityBig.get(i));
		}
		
		ArrayList<Integer> a1 = get(unityBig);
		
		for (int j3 = 0; j3 < a1.size(); j3++) {
		System.out.print(a1.get(j3));
		}
		
		
		
	}
	
	public static ArrayList<Integer> get(ArrayList<Integer> big) {
		 ArrayList<Integer> a1 = new ArrayList<Integer>();
		 for (int i = 0; i < a1.size(); i++) {
			int num = a1.get(i);
			if (num % 2 == 0) {
				a1.add(num);
			}
		}
		return a1;
	}
}