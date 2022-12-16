package dependancyInjetion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student msp = context.getBean("student", Student.class);
		msp.displayStudentInfo();
		System.out.println("msp Bean Location "+msp);
		
		Student msp2 = context.getBean("schoolStudent", Student.class);
		msp2.displayStudentInfo();
		System.out.println("map2 bean Location "+msp2);
	}

}
