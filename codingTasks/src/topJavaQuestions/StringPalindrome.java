package topJavaQuestions;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
		String s = "madam";
		isPalindrome(s);
		
		
	}
	
	public static void isPalindrome(String s) {
		
		String rev = "";
		for(int i = s.length() -1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a Palindrome");
		}
	}

}
