package dependancy_injection_object_type;

public class Student {
	private int id;
	private MathsCheat mathsCheat;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMathsCheat(MathsCheat mathsCheat) {
		this.mathsCheat = mathsCheat;
	}
	
	public void cheating() {
		mathsCheat.mathsCheating();
		System.out.println("My id is "+id+" take and do whatever you want to do...");
	}
	
	

}
