package APisource;

public class Ddemo1
{
public static void main(String[] args)
{
	TiankPad T1 = new TiankPad();
	T1.PowerOn();
	
	UsB u1 = new Mouse();
	//����ת�� usb���ͣ�ȷ���������usb
	
	T1.UseDevice(u1);// �Զ�����ת��
}
}
