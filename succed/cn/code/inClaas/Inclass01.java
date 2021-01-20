package cn.code.inClaas;

//内用外 随意访问 外用内 需要外部对象
public class Inclass01 {
	
	private String name;
	private int num;
	
	public class Dokidoki {
		int num = 10;

		public void beat() {
			System.out.println("dokidoki~~~~~awsl");
			// System.out.println(name);//随便访问
		}

		public void M2() {
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Inclass01.this.num);
			class M3 
			{
				int num  =10;
			// 定义在方法内部的·叫局部定义类
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
		new Dokidoki().beat();// 匿名对象
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


}
