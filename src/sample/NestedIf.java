package sample;

public class NestedIf {

	public static void main(String[] args) {
	
		int x=10;
		int y=20;
		
		if(x+y>10) {	
		if(x+y>100) {//false
			System.out.println("x+y is greater than 10");
		}
		        //30>80//false
		else if(x+y>4) {//true
			System.out.println("heloo");
		}
		        //30>20
		else if(x+y>=20) {
			System.out.println(" x+y is greater than 20");
			
		}else {
			System.out.println("none of the above condition is not true");
		}
		}
		else {
			System.out.println("none of the above condition");
		}

	}

}
