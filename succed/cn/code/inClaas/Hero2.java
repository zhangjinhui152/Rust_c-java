package cn.code.inClaas;

public class Hero2 
{
	private String name;
	private killqueen kill;
	
	
	public Hero2()
	{
		// TODO �Զ����ɵĹ��캯�����
	}
	public Hero2(String name, killqueen kill)
	{
		super();
		this.name = name;
		this.kill = kill;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public killqueen getKill()
	{
		return kill;
	}
	public void setKill(killqueen kill)
	{
		this.kill = kill;
	}
	void attack()
	{
		kill.use();
	}
	
}
