package Lowes;

public class ReverseAnInteger {
	
	public static void main(String[] args) {
		
		int num1 = 12345;
		int num2 = 678910;
		
		int rem = 0;
		int rev = 0;
		
		while(num1 != 0) {
			rev = (rev * 10) + num1 % 10;
			num1 = num1 / 10;
		}

		System.out.println(rev);
		
		
		
		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());
		
		
	
	}
}
