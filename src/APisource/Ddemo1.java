package APisource;

public class Ddemo1
{
public static void main(String[] args)
{
	TiankPad T1 = new TiankPad();
	T1.PowerOn();
	
	UsB u1 = new Mouse();
	//向上转型 usb类型，确保传入的是usb
	
	T1.UseDevice(u1);// 自动类型转换
}
}
