package cn.code.inClaas;

//������ ������� ������ ��Ҫ�ⲿ����
public class Inclass01 {
	
	private String name;
	private int num;
	
	public class Dokidoki {
		int num = 10;

		public void beat() {
			System.out.println("dokidoki~~~~~awsl");
			// System.out.println(name);//������
		}

		public void M2() {
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Inclass01.this.num);
			class M3 
			{
				int num  =10;
			// �����ڷ����ڲ��ġ��оֲ�������
			public void M4() {
				System.out.println(num);
			}
			
		
			
		}
			M3 m5 = new M3();
			m5.M4();
	}
	
	public void Methon() {
		System.out.println("out");
		
		}
	}


	public void M1() {
		new Dokidoki().beat();// ��������
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


}
