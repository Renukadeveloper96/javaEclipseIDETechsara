package assignment;

import java.util.Scanner;

public class Caculator {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first number and second number -");
		int a=sc.nextInt();
		int b=sc.nextInt();
System.out.print("Enter type of operation which you want to perform(+,-,*,/,%)=");
				
		char op=sc.next().charAt(0);
		solve(a,b,op);
	}

	private static int solve(int a, int b, char op) {
		int result= 0;
		//addition
		if(op=='+') {
			result=a+b;
			
		}else if(op=='-') {
		result=a-b;
		}else if(op=='*') {
			result=a*b;
		}else if(op=='%') {
			result=a%b;
		}else if(op=='/') {
			result=a/b;
		}
		System.out.println("your calculate result is ="+result);
		return result;
		
		}
	}


