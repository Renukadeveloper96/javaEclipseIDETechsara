package array;

public class MultidemensionalArray {

	public static void main(String[] args) {
//		datatype[][]myNumbers ={{1,2,3,4},{5,6,7}};
		int [][][] a= {
				{{75,87,69},
				{90,87,8},{6,7,9}},
				{{78,67,78},
					{89,78,79},{67,56,76}},
				{{73,65,72},
						{89,7,9},{5,6,7}
				}
				};
//		System.out.println("length of row 1:" +a[0][1]);
//		System.out.println("length of row 1:" +a[2].length);
		
//		System.out.println(a[1].length);
		System.out.println(a.length);
		for (int i=0;i<a.length;i++) {
         for(int j=0;j<a[i].length;j++) {
        	 for(int k=0;k<a[j].length;k++)
        	 System.out.println(a[0][1][1]);
         }
		}
	}

}
