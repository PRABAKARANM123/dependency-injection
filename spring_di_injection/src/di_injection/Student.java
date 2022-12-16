package di_injection;

public class Student {
	MathCheat mathCheat;
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void cheating() {
		mathCheat.mathCheat();
	}

}
