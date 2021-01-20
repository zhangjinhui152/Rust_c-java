package cn.code.base2;
import java.util.ArrayList;
import java.util.Random;
public class ArrayList06 {
	public static void main(String[] args) {
		
		ArrayList<Integer> unityBig= new ArrayList<Integer>();
		Random r1 = new Random();
		
		int num;
		
		
		for(int i = 0;i < 20;i++)
		{
			num =r1.nextInt(100);
			unityBig.add(num);
		//	System.out.print(unityBig.get(i));
		}
		
		ArrayList<Integer> a1 = get(unityBig);
		
		for (int j3 = 0; j3 < a1.size(); j3++) {
		System.out.print(a1.get(j3));
		}
		
		
		
	}
	
	public static ArrayList<Integer> get(ArrayList<Integer> big) {
		 ArrayList<Integer> a1 = new ArrayList<Integer>();
		 for (int i = 0; i < big.size(); i++) {
			int num = big.get(i);
			if (num % 2 == 0) {
				a1.add(num);
			}
		}
		return a1;
	}
	}

