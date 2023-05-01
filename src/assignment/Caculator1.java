package assignment;

import java.util.Scanner;

public class Caculator1 {

	private static int calculator(int a, int b) {
		   return a+b;
		
	}
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number and second number -");
		int a=sc.nextInt();
		int b=sc.nextInt();
		calculator(a,b);
		
		
		int addition = a+b;
		System.out.println("addition="+addition);
		
		
		int substraction = a-b;
		System.out.println("substraction="+substraction);
		
		
		int multiplication = a*b;
		System.out.println("multiplication="+multiplication);
		
	
		int module = a%b;
		System.out.println("module="+module);
	
	
		int divided = a/b;
		System.out.println("divided="+divided);
	}

}
