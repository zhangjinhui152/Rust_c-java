package DemoForLsmbda;

import java.util.Arrays;

public class returnFormst
{
	public static void main(String[] args)
	{

	}

	public static void show()
	{
		Person[] arr = {
			new Person(10),	
			new Person(10),	
			new Person(10),	
		};
		
		
		Arrays.sort(arr,(Person o1,Person o2)
				->{return o1.getA()-o2.getA();
				});
		
		
		
	}
}
