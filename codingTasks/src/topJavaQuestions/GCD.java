package topJavaQuestions;

public class GCD {
	
	public static void main(String[] args) {
		
		gcd(45,145);
		
	}
	
	public static void gcd(int num1, int num2) {
		
	int gcd = 0;
	
	for(int i = 1; i <= num1 && i <= num2; i++) {
		if(num1%i==0 && num2%i==0) {
			gcd = i;
		}
	}
	
	System.out.println(gcd);
	
	}
}
