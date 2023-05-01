package method;

public class MethodExample {
	
	public int addition(int a,int b) {
		System.out.println(a*b);
		return a+b;
	}
	public void farmer() {
		System.out.println("parent is farmer:you have land");
	}
//   public void multiplication (int a,int b) {
//		
//		 System.out.println(a*b);//void does not return type values
//	}
   
	public static void main(String[] args) {
		MethodExample methodExample=new MethodExample();
		
//			methodExample.addition(5,8);
		    System.out.println(methodExample.addition(5,8));


	}

}
