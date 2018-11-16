package otherTasks;

import java.util.Scanner;

public class SmallestAndLargestNumbers {
	
	public static void main(String[] args) {
		
		Integer max = Integer.MIN_VALUE;
		Integer min = Integer.MAX_VALUE;
		String s;

		do {
			Scanner in1 = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int num = in1.nextInt();
			
			if(num > max) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
			
			Scanner in2 = new Scanner(System.in);
			System.out.println("Do you want to continue? y/n");
			s = in2.nextLine();
			
			if(s.equals("n")) {
				break;
			}
	
		}while(s.equals("y"));
		
		System.out.println("Max number is: " + max);
		System.out.println("Min number is: " + min);
	}

}
