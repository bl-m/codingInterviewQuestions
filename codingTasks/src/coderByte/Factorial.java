package coderByte;

public class Factorial {
	
	public static void main(String[] args) {
		
		int num = 8;
		int sum = 1;
		
		for(int i = num; i > 0; i--) {
			sum = sum * i;
		}
		
		System.out.println(sum);
		
		
	}

}
