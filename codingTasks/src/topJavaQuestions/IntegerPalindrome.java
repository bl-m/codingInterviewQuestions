package topJavaQuestions;

public class IntegerPalindrome {
	
	public static void main(String[] args) {
		
		int num = 3433;
		
		isIntegerPalindrome(num);
		
	}
	
	public static void isIntegerPalindrome(int num) {
		
	int rem = 0;
	int temp = num;
	int sum = 0;
	
	while(num > 0) {
		rem = num % 10;
		sum = sum * 10 + rem;
		num = num / 10;
	}
	
	if(temp == sum) {
		System.out.println("Number is palindrome");
	}
	else {
		System.out.println("Number is not a palindrome");
	}
		

	}

}