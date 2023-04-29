package assignment;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter any number");
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		for(int i=n;i>=0;i--) {
//			System.out.println(arr[i]+" ");
//		}
//		sc.close();
		int num=1234;
		int reversed=0;
		while(num!=0) {
			int digit=num%10;
			reversed=reversed *10+digit;
			num=num/10;
		}
		System.out.println("Reversed Number :"  +reversed);

	}

}
