package cn.code.string;

public class String01 {
public static void main(String[] args) {
	//System.out.println("hello");
	//´´½¨×Ö·û´®µÄ3+1
	//one
	//public String();
	//string(char[] array)
	//string(byte[] array)
	String s1 = new String();
	System.out.println(s1);
	
	char[] c1 = {'a','b'};
	String s2 = new String(c1);
	System.out.println(s2);
	
	byte[] b1 = {97,98,99};
	String s3 = new String(b1);
	System.out.println(s3);
	
	String s4 = "hello";
	System.out.println(s4);

}
}
