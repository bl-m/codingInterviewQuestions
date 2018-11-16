package otherTasks;

import java.util.Scanner;

public class LargestNumberInSum {
	
	public static void main(String[] args) {
		
		int sum = 0;
		Integer largest = Integer.MIN_VALUE;
		
		for(int i = 0; i < 3; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter number " + (i+1));
			int num = in.nextInt();
			sum = sum + num;
			
			if(num > largest) {
				largest = num;
			}
		}
		
		System.out.println("Largest number: " + largest);
		System.out.println("Sum: " + sum);
	}

}
