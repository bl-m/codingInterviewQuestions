package topJavaQuestions;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int num = 407;
		
		isArmstrong(num);
	}
	
	public static void isArmstrong(int num) {
		
		int rem = 0;
		int sum = 0;
		int temp = num;
		
		while(num > 0) {
			rem = num % 10;
			sum = sum + (rem*rem*rem);
			num = num / 10;
		}
		
		if(temp == sum) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}		
	}
}
