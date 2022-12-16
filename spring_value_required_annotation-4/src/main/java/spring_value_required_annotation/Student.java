package spring_value_required_annotation;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	private String name;
	@Value("${student.intrestedCourse}")
	private String intrestedCourse;
	@Value("${student.hobby}")
	private String hobby;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name is : "+name);
		System.out.println("Student interested Course is : "+intrestedCourse);
		System.out.println("Student hobby is : "+hobby);
	}
	
	

}
