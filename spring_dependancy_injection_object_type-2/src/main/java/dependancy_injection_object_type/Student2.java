package dependancy_injection_object_type;

public class Student2 {
	private MathsCheat cheat;

	public void setCheat(MathsCheat cheat) {
		this.cheat = cheat;
	}
	
	public void startCheating() {
		cheat.mathsCheating();
	}

}
