package InteviewQuestions;

public class IntegerPalindrome {
	
	public static void main(String[] args) {
		
		int palindrome = 34343;
	    int reverse = 0;
	    int number = palindrome;
	    
	    while (palindrome != 0) {
	        int remainder = palindrome % 10;
	        reverse = reverse * 10 + remainder;
	        palindrome = palindrome / 10;
	    }
	    
	    if (number == reverse) {
	        System.out.println(true);;
	    }
	    else {
	    	System.out.println(false);
	    }
	}
}
