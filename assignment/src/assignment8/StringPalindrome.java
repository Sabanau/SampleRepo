package assignment8;

public class StringPalindrome {

	public static void main(String[] args) {
		StringPalindrome obj = new StringPalindrome("JAVA");
		StringPalindrome obj1 = new StringPalindrome("Malayalam");
	}
	
	public StringPalindrome(String input) {
		StringBuilder sb = new StringBuilder(input);
        String revString = sb.reverse().toString();
       if(input.equalsIgnoreCase(revString)) {
    	   System.out.println(input+" is a palindrome");
       }
       else {
    	   System.out.println(input+ " is not a Palindrome");
       }
		
	}

}
