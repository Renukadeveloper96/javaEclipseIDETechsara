package sample;

public class IfElseIf {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		
		if(x+y>100) {//true
			System.out.println("x+y is greater than 100");
		}
		else if(x+y>80) {//false
			System.out.println(" x+y is less than 80");
		}
		else if(x+y>120) {
			System.out.println(" x+y is greater than 120");
		}
		else {
			System.out.println("none of the above condition is not true");
		}
		}
	}


