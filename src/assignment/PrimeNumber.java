package assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
//		int number=71;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int number=sc.nextInt();
		boolean isPrime=false;
		for(int i=2;i<=number;i++) {
			if(number%2==0) {
				isPrime=false;
			}
			else {
				isPrime=true;
			}
		}
		if(isPrime) {
			System.out.println(+number+" is Prime number");
		}else {
			System.out.println(+number+ " is not Prime number");
		}

		
	}

}
