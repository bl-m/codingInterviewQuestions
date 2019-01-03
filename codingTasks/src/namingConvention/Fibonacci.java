package namingConvention;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		fibonacci(5);
		
	}
	
	public static void fibonacci(int num) {
		
		int a = 0;
		int b = 1;
		int c = a+b;
		
		int res = 0;
		int count = 0;
	
		while(c < num) {
			count++;
			
			a = b;
			b = c;
			c = a+b;
			
			if(num == count) {
				
				if(num == 0) {
					res = 0;				
				}
				
				if(num == 1) {
					res = 0;				
				}
				
				res = c;
				break;
			}

			
			} 
		System.out.println(res);
	}
}

