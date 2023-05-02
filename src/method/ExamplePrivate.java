package method;

public class ExamplePrivate{

	protected void print() {
		System.out.println("private ");
	}
	protected void Print() {
		System.out.println("private HI ");
	}
	
	public static void main(String[] args) {
		ExamplePrivate ExamplePrivate=new ExamplePrivate();
		ExamplePrivate.print();
		ExamplePrivate.Print();
	}
}
