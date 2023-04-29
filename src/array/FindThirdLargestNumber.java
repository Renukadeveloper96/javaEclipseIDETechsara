package array;

public class FindThirdLargestNumber {

	public static void main(String[] args) {
	
		int []a=new int[] {10,3,4,5,6,7,8,9};
		System.out.println("third Largest :" +third(a,8));

	}

	private static int third(int[] a, int  total) {
		
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-5];
	}

}
