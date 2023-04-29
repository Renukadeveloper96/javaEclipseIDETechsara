package array;

import java.util.Arrays;

public class SortInteger {

	public static void main(String[] args) {
		
		  //index of  0  1 2 3 4=elements(5)
		int number[]= {36,19,29,12,5};
		for(int i=0;i<number.length;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]>number[j]) {
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		
			System.out.println(Arrays.toString(number));
		

	}

}
