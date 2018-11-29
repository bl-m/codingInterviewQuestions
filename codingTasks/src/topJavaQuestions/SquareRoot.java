package topJavaQuestions;

public class SquareRoot {
	public static void main(String[] args) {
		
		int num = 49;
		int squareRoot = 0;
		for(int i = 0; i < num; i++) {
			if(i*i==num) {
				squareRoot = i;
			}
		}
		System.out.println(squareRoot);
	}
}
