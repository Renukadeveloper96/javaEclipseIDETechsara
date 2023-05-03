package variable;

public class ClassVariable {

	int x=100;

	public void show() {
		x=x+100;
		System.out.println("inside show method x="+x);	
	}
	public void display() {
		System.out.println("inside display method x="+x);
	}

	public static void main(String[] args) {
		ClassVariable classVariable=new ClassVariable();
		classVariable.display();
		classVariable.show();
	
	
	}

}
