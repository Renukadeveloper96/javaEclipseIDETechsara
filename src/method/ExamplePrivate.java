package method;

public class ExamplePrivate {

	protected void print() {
		System.out.println("private ");
	}
	
	public static void main(String[] args) {
		ExamplePrivate ExamplePrivate=new ExamplePrivate();
		ExamplePrivate.print();
	}
}
