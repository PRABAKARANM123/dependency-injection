package spring_value_required_annotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String name;
	private String intrestedCourse;
	private String hobby;
	
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("${student.intrestedCourse}")
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}
	// if any fields is mandatory use @Requird annatation
	// when we use this annatation with out this field 
	// bean will not created and throw exception
	@Required
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name is : "+name);
		System.out.println("Student interested Course is : "+intrestedCourse);
		System.out.println("Student hobby is : "+hobby);
	}
	
	

}
