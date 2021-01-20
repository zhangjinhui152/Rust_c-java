import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import TheaadPond.Runer;

public class ThreatPond
{
	public static void main(String[] args)
	{
		ExecutorService es = Executors.newFixedThreadPool(2);
		es.submit(new Runer());
		es.submit(new Runer());
		es.submit(new Runer());
	}
}
