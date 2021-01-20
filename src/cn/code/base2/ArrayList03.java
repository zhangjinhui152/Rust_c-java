package cn.code.base2;
import java.util.Random;
import java.util.ArrayList;
public class ArrayList03 {
		public static void main(String[] args) {
			Random r1 = new Random();
			int ran;
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			
			
			for (int i = 0; i < 6; i++) {
				ran = r1.nextInt(33)+1;
				a1.add(ran);
				
			}
			for(int j = 0;j <a1.size();j++)
			{
				System.out.println(a1.get(j));
			}
		}
}
