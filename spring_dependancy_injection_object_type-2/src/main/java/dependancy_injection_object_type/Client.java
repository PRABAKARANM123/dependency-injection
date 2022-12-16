package dependancy_injection_object_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("sts", Student.class);
		student.cheating();
		
		Student2 student2 = context.getBean("stsnew", Student2.class);
		student2.startCheating();
		
		// student and sudent2 classes were using common dependency so dont want 
		//to create 'MathsCheat' bean two time in beans.xml like given below
		
		/* <bean id = "sts" class = "dependancy_injection_object_type.Student">
		  <property name="id" value="110"></property>
		  <property name="mathsCheat">
		  <bean class="dependancy_injection_object_type.MathsCheat"></bean>
		  </property>
		  </bean>

		  <bean id="stsnew" class="dependancy_injection_object_type.Student2">
		  <property name="cheat">
		  <bean class="dependancy_injection_object_type.MathsCheat"></bean>
		  </property>
		  </bean> */
	}

}
