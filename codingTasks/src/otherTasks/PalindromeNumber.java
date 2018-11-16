package otherTasks;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		int num = 171;
		int remainder = 0;
		int temp = num;
		int sum = 0;
		
		while(num > 0) {
			
			remainder = num % 10;
			sum = (sum * 10) + remainder;
			num = num / 10;
		}
		
		if(temp == sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
