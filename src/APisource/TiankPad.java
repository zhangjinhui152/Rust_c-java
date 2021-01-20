package APisource;

public class TiankPad
{
	public void PowerOn()
	{
		System.out.println("!!!Open");
	}
	public void PowerOff()
	{
		System.out.println("!!!Close");
	}
	public void UseDevice(UsB usb)
	{
		usb.open();
		usb.close();
	}
}
