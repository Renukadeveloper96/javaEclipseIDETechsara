package array;

public class SearchStringArrayExample {

	public static void main(String[] args) {
	String[] strArray= {"k","p","a"};
	boolean found=false;
	int index=0;
	String s="K";
	
	for(int i=0;i<strArray.length;i++) {
		if(s.equalsIgnoreCase(strArray[i])) {
			index=i;
			found=true;
			break;
		}
	}
	if(found) {
		System.out.println(s+" found at the index :"+index);
	}else {
		System.out.println(s + " not found at the index "+ index);
	}

	}

}
