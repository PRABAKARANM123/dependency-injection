package dependancyInjetion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student msp = context.getBean("student", Student.class);
		msp.displayStudentInfo();
		
		Student sts = context.getBean("schoolStudent", Student.class);
		sts.displayStudentInfo();
		
		
	}

}
