package topJavaQuestions;

public class LCM {
	
	public static void main(String[] args) {
		
		int num1 = 72;
		int num2 = 120;
		// res 360
		
		lcm(num1, num2);
		
	}
	
	public static void lcm(int num1, int num2) {
		
		int lcm = (num1 > num2) ? num1 : num2;
		
		while(true) {
			if(lcm % num1 == 0 && lcm % num2 == 0) {
				break;
			}
			lcm++;
		}
		
		System.out.println(lcm);
	}

}
