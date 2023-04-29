package assignment;

public class Student {

	public static void main(String[] args) {
		int x=10;
		int y=70;
		int z=10;
		if(x+y+z>20) {
		if((x+y>20)&&(y+z>500)) {//false
			System.out.println("true");
		}else if(y+z>20){
			System.out.println("x+y is greater than 20");
		}else if(x+z>30) {
			System.out.println("x+z is less than 600");
		}else {
			System.out.println("none of the above condition is not true");
		}
		}
		else {
			System.out.println("none");
		}
	}
}
