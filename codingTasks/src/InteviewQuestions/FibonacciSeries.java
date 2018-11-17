package InteviewQuestions;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		int c = a + b;
		
		System.out.println(c);
		
		while(c<20) {
			a = b;
			b = c;
			c = a + b;
			
			System.out.println(c);
		}
	}

}
