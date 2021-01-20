package waitAndNOgir;

public class Main
{
	public static void main(String[] args)
	{
		BAO bz = new BAO();
		new market(bz).start();
		new eat(bz).start();
		
		
		
	}
}
