package di_injection;

public class Client {
	public static void main(String[] args) {
		Student sts = new Student();
		MathCheat cheat = new MathCheat();
		sts.setMathCheat(cheat);
		sts.cheating();
	}

}
