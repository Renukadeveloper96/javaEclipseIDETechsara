package assignment;

public class PalidromeString {
	public static void main(String[] args) {
		String str = "MadAm";
		String reverseStr = "";
		int strLength = str.length();
		
		for(int i=(strLength - 1);i>=0;i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		
		/// madam            .euals   MADAM
		if (str.toLowerCase().equals(reverseStr.toUpperCase())){
			System.out.println(str+ " Is a Palidrome.");	
		}
		else {
			System.out.println(str+ "Is not a Palidrome.");
		}
		
		
	}

}
