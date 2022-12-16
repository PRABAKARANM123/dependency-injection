package spring_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {
		//Jio jio = new Jio(); -> instead of creating manual object
		//like this using below IOC container create object for us
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("confic loaded");
		Airtel air = (Airtel)context.getBean("airtel"); // type casting
		air.calling();
		air.data();
		
		System.out.println("---------------------");
		
		Vodaphone voda = (Vodaphone)context.getBean("vodaphone"); // No need type casting
		voda.calling();
		voda.data();
		// in above method source code have changed we achive without change code 
		//given below using interface reference
		
		System.out.println("---------------------");
		System.out.println("Using Interface reference");
		
		Sim sim = context.getBean("sim", Sim.class);
		
		
		sim.calling();
		sim.data();
		
		
		/*Airtel air = new Airtel();
		air.calling();
		air.data();*/   // by using class reference
		
		/*Sim sim = new Airtel();
		sim.calling();
		sim.data();*/   // by using interface reference
		
		/*in above both classes when we change network 
		we modified source code every time this is not 
		a good approach in this scenario IOC container
		help us , it create the object and manage the 
		object for us and Spring read the confic
		file and get a data for object creation and
		create the object and stored in IOC container
		using the get bean method by implementing IOC
		container we can use it, Two type of IOC 
		container we have 1.BeanFactory, 
		2.ApplicationContext it is provide some 
		addition feature and BeanFactory is legacy one 
		both are Interfaces and provide implementation 
		class also ie. 'ClassPathXmlApplicationContext' */
	}

}
