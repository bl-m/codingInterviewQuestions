package Lowes;

public class Factorial {
	
	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		int num3 = num1 + num2;
		System.out.println(num3);
		
		while(num3 <= 20) {
			num1 = num2;
			num2 = num3;
			num3 = num1 + num2;
						
			if(num3 >= 20) {
				break;
			}
			
			System.out.println(num3);

		}
			
	}

}
