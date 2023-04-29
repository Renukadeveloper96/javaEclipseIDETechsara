package array;

public class TwoRowsFourCols {

	public static void main(String[] args) {
		int[][]arr={{10,20,30,40},{20,30,30,40},{30,30,40,50}};
//		arr[0][0]=1;
//		arr[0][1]=2;
//		arr[0][2]=2;
//		arr[0][3]=4;
//		arr[1][0]=5;
//		arr[1][1]=5;
//		arr[1][2]=5;
//		arr[1][3]=5;
		
//		System.out.println(arr.length);
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+", ");
			}
			System.out.println();
		}
	}

}
