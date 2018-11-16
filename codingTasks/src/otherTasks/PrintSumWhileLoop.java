package otherTasks;

public class PrintSumWhileLoop {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		while(num <= 101) {
			sum = sum + num;
			num++;
		}
		
		System.out.println(sum);
	}

}
