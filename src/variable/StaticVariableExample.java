package variable;

public class StaticVariableExample {

	
	int x,y;
	static int z;
	
	
	public StaticVariableExample(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void show() {
		int a;
		System.out.println("inside show method");
		System.out.println("x="+x+",y="+y+",z="+z);
	}


	public static void main(String[] args) {
		StaticVariableExample obj1=new StaticVariableExample(10,20);
		StaticVariableExample obj2=new StaticVariableExample(100,200);
		obj1.show();
		obj2.show();
	}
}
