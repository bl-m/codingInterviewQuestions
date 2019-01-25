package codingQuestions;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		int [] b = {1,2,3,4,5,6,7,8,9,10,11};
		
		int sum1 = 0;
		int sum2 = 0;
		
		for(int x : a) {
			sum1 = sum1 + x;
		}
		
		for(int x : b) {
			sum2 = sum2 + x;
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum2 - sum1);
	}
}
