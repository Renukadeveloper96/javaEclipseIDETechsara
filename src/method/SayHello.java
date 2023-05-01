package method;

public class SayHello {

	

	void sayHelloWorld(int numOfTimes) {
		for(int i=1;i<=numOfTimes;i++) {
			System.out.println(numOfTimes*2);
		}
	}
	
	void printMultiplication(int number,int number2) {
		
		for(int i=1;i<=number2;i++) {
			System.out.printf("%d*%d=%d",number,i,number*i).println();
//			System.out.println(i);
		}
	}
	public static void main(String[] args) {
//		SayHello sayHello=new SayHello();
//		sayHello.sayHelloWorld(5);	
		
		SayHello printMulti=new SayHello();
		printMulti.printMultiplication(6,5);
		
	}
	

}
