package variable;

public class FinalVarible {
	final int a = 10;// ====globle variable

	public void show() {
		final int b = 20;
		System.out.println("a=" + a + "b=" + b);

		// a=20; final variable can't be modified

	}

	public static void main(String[] args) {
		FinalVarible ob1 = new FinalVarible();
		ob1.show();

	}
}
