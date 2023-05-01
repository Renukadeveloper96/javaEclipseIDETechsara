package method;

public class MultiplicationTable {
	public static void print() {//without argument/without signature 
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d=%d",5,i,5*i).println();
		}
	}
	public static void print(int number) {//with argument 
		for(int i=1;i<=10;i++) {
			System.out.printf("%d * %d=%d",number,i,number*i).println();
		}
	}
	public static void print(int number,int from,int to) {//with argument 
		for(int i=from;i<=to;i++) {
			System.out.printf("%d * %d=%d",number,i,number*i).println();
		}
	}
	
	public static void main(String[] args) {
		MultiplicationTable multiplicationTable=new MultiplicationTable();
		System.out.println("without argument method");
		multiplicationTable.print();
		System.out.println("with one argument method");
		multiplicationTable.print(5);
		System.out.println("with three argument method");
		multiplicationTable.print(5,1,10);
	
	}

}
