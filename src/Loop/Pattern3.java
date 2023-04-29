package Loop;

import java.util.Scanner;
public class Pattern3 {
	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of rows needed to print the pattern ");
	        int rows = scanner.nextInt();
	        
	        for (int i=rows; i>=1; i--)
	        {
	            // Print star in decreasing order
	            for (int k=1; k<=(i * 2) -1; k++) 
	            { 
	                System.out.print("*"); 
	            } 
	            System.out.println(); 
	            // Print space in increasing order 
	            for (int j=rows; j>=i; j--)
	            {
	                System.out.print("-");
	            }
	            
	        }
	        scanner.close();
	    }
	}


