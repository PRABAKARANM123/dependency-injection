package spring_ioc;

public class Airtel implements Sim{
	
	@Override
	public void calling() {
		System.out.println("Calling by using Airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("data by using Airtel sim");
		
	}

}
