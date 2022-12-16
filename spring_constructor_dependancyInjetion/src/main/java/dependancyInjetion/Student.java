package dependancyInjetion;

public class Student {
	private int id;
	private String studentName;
	
	public Student (int id) {
		this.id = id;
	}
	
	public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name is : "+studentName+" and ID is : "+id);
	}

}
