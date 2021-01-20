package cn.code.ArraysAnfMath;
import java.util.Arrays;


public class demo02 {
public static void main(String[] args) {
	
	String s1 = "hiuevyhutywuiytaoltyobVLEthil";
	char[] c1 = s1.toCharArray();
	
	Arrays.sort(c1);
	
	for (int i = c1.length-1; i >=0; i--) {
		System.out.print(c1[i]);
		
	}
}
}
