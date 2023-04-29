package array;

import java.util.Arrays;

public class RemovingElementFromArray {

	public static void main(String[] args) {
		int[] arr= {25,14,56,15,36};
		System.out.println("original Array:"+Arrays.toString(arr));

		int removeIndex=1;
		for(int i=removeIndex;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			
		}
		System.out.println("after removing the second element "+Arrays.toString(arr));
	}

}
