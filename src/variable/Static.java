package variable;

public class Static {
	final int a = 10;// ====globle variable

	public void show() {
		final int b = 20;
		System.out.println("a=" + a + "b=" + b);

		// a=20; final variable can't be modified

	}

	public static void main(String[] args) {
		Static ob1 = new Static();
		ob1.show();

	}
}
