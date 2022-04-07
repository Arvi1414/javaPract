package javaPract;

public class javaStringReversal {

	public static void main(String[] args) {
		//Reversing a String
		
		String Name = "ARAVARA";
		
		int length = Name.length();
		System.out.println("Length of the String is :" + length);
		
		for(int i=length-1;i>=0;i--) {
			System.out.print(Name.charAt(i));
		}
		
		String revName = "";
		
		for(int i=length-1;i>=0;i--) {
			
			revName += Name.charAt(i);
			
		}
		System.out.println("");
		System.out.println(revName);
		
		if(Name.equals(revName)) {
			System.out.println("The given word is Palindrome");
		}
		else {
			System.out.println("The given word is not a Palindrome");
		}
		
		int num = 95959;
		
		String numStr = Integer.toString(num);
		
		int length2 = numStr.length();
		
		for(int i=length2-1;i>=0;i--) {
			System.out.print(numStr.charAt(i));
		}
		
		String revNum = "";
		
		for(int i=length2-1;i>=0;i--) {
			revNum += numStr.charAt(i);
		}
		
		System.out.println("");
		System.out.println(revNum);
		
		if(numStr.equals(revNum)) {
			System.out.println("The given number is Palindrome");
		}
		else {
			System.out.println("The given number is not a Palindrome");
		}
		
	}
	

}
