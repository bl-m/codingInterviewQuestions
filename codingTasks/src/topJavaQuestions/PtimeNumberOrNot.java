package topJavaQuestions;

public class PtimeNumberOrNot {
	
	public static void main(String[] args) {
		
		isPrime(17);
		
	}
	
	public static void isPrime(int num) {
		
		boolean flag = false;
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println(num + " is Prime");
		}
		else {
			System.out.println(num + " is not a Prime");
		}
	}
}
