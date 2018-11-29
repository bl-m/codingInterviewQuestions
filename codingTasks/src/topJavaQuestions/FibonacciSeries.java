package topJavaQuestions;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int num = 20;
		fibonacci(num);
		
	}
	
	
	public static void fibonacci(int num) {
		
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		
		int c = a + b;
		
		System.out.println(c);
		
		
		while(c < num) {
			a = b;
			b = c;
			c = a + b;
			
			System.out.println(c);
		}
		
	}

}
