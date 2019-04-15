package Lowes;

public class GCD {
	
	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 45;
		int c = 0;
		int gcd = 0;
		
		for(int i = 1; i <= num1 && i <= num2; i++) {
			if(num1%i==0 && num2%i==0) {
				gcd = i;
			}
		}
		
		System.out.println((num1*num2)/gcd);
	}
	
}
