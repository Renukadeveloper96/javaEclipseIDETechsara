package assignment;

import java.util.Scanner;

public class DisplayOddNumbers {

	public static void main(String[] args) {
		
		System.out.println("enter any number");
	    int number ,i;
	    Scanner sc=new Scanner(System.in);
	    number =sc.nextInt();

	    i=1;
	    System.out.println("list of odd numbers");
	    while(i<=number) {
	    	System.out.println(i);
	    	i=i+2;
	    }
	}

}
