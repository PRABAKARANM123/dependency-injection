package spring_ioc;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling by using Vodafon sim");
		
	}

	@Override
	public void data() {
		System.out.println("data by using Vodafone sim");
		
	}

}
