package assignment;

public class SwapTwo {

	public static void main(String[] args) {
		
		int a=50;
		int b=20;
		System.out.println("before swap is a="+a+ ",b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap is a="+a+ ",b="+b);
	}

}
