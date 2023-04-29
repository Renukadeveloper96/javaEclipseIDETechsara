package assignment;

import java.util.Scanner;

public class SimpleifstatmentWithGrosary {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter name");
//		
//		String name = scanner.nextLine();
//
////		System.out.println("Enter age ");
////		int age = scanner.nextInt();
//		
//		System.out.println("Enter gender");
//		String gender = scanner.nextLine();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name");
		String name=sc.next();
		
		System.out.print("Enter your gender");
		String gender=sc.next();
//		String name="ram";
//		String gender="male";
		
		if(name.equals("kumar")) {
			if(gender.equals("male")) {
				System.out.println(name+" is "+gender);
			}
			else if(gender.equals("female")) {
				System.out.println(name+" is "+gender);
			}
			else if(gender.equals("others")) {
				System.out.println(name +" is "+gender);
			}
			else {
				System.out.println(name+" is not "+gender);
			}
		}
		else {
			System.out.println("your name is unknown");
		}

	}
}
//		if (age > 21 && gender == "male") {
//			if (gender == "male") {
//				System.out.println(name + " is eligible for buying alochal");
//			} else if(name=="ram"){
//				System.out.println("not eligible");
//			}
//		} 
//		else {
//			System.out.println(name + " is  under age");
//
//		}
