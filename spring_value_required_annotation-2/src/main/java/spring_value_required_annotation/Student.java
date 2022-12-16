package spring_value_required_annotation;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String name;
	private String intrestedCourse;
	private String hobby;
	@Value("Prabakaran")
	public void setName(String name) {
		this.name = name;
	}
	@Value("Java")
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}
	@Value("Reading")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name is : "+name);
		System.out.println("Student interested Course is : "+intrestedCourse);
		System.out.println("Student hobby is : "+hobby);
	}
	
	

}
