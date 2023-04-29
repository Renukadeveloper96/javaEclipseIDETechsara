package assignment;

import java.util.Scanner;

public class GroceryEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Enter your gender (M/F/O): ");
        String gender = scanner.nextLine();

        // Verify eligibility based on age and gender
        if (age >= 18) {
            if (gender.equals("M")) {
                System.out.println("Welcome, Mr. " + name + "! You are eligible to purchase groceries.");
            } else if (gender.equals("F")) {
                System.out.println("Welcome, Ms. " + name + "! You are eligible to purchase groceries.");
            } else if (gender.equals("O")) {
                System.out.println("Welcome, " + name + "! You are eligible to purchase groceries.");
            } else {
                System.out.println("Invalid input for gender. Please enter 'M', 'F', or 'O'.");
            }
        } else {
            System.out.println("Sorry, " + name + ". You are not eligible to purchase groceries.");
        }
    }
}
