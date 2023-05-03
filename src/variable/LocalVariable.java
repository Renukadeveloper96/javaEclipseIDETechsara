package variable;

public class LocalVariable {
	

	
	public void show() {
		int a=10;//local variable
		System.out.println("inside show method a="+a);
		
	}
	public void display() {
		int b=20;
		System.out.println("inside display method b="+b);
		
		//trying to access variable 'a'-generates an ERROR
//		System.out.println("inside show method a="+a);
	}

	public static void main(String[] args) {
		LocalVariable localVariable=new LocalVariable();
		localVariable.show();
		localVariable.display();

	}

}
