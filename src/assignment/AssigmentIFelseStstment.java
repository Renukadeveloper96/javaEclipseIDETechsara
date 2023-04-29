package assignment;

import java.util.Scanner;

public class AssigmentIFelseStstment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		  System.out.print("Enter your name: ");
	        String name = scanner.nextLine();
//	        System.out.print("Enter your age: ");
//	        int age = scanner.nextInt();
//	        scanner.nextLine(); // consume the newline character
	        System.out.print("Enter your gender (M/F/O): ");
	        String gender = scanner.nextLine();
		 
		
		
			if (name=="kumar") {
				if(gender==("m")) {
				System.out.println("you are eligible to purchase the grosary");
				}
				else if (gender=="f") {
				System.out.println("you are eligible to purchase the grosary");
				}
				else if(gender=="o") {
				System.out.println("you are eligible to purchase to grosary");	
				}
				else {
				System.out.println("invalid input for gender");	
				}		
				}
				else {
					System.out.println("you are not eligible to perchase");
				}
	}

}