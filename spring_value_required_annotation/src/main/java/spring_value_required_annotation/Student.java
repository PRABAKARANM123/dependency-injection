package spring_value_required_annotation;

public class Student {
	private String name;
	private String intrestedCourse;
	private String hobby;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name is : "+name);
		System.out.println("Student interested Course is : "+intrestedCourse);
		System.out.println("Student hobby is : "+hobby);
	}
	
	

}
