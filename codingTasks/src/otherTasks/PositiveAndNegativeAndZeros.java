package otherTasks;

import java.util.Scanner;

public class PositiveAndNegativeAndZeros {
	
	public static void main(String[] args) {
		
//		Write a program to prompt the user to enter 
//		the numbers till the user wants 
//		(by asking user if he wants to continue) 
//		and at the end it should display the count of 
//		positive, negative and zeros entered. 
		
		int num;
		int pos = 0;
		int neg = 0;
		int zeros = 0;
		String s;
		
		do {
			Scanner in1 = new Scanner(System.in);
			System.out.println("Enter your number: ");
			num = in1.nextInt();
			
			Scanner in2 = new Scanner(System.in);
			System.out.println("Continue? y/n");
			s = in2.nextLine();
			
			if(s.equals("y")) {
				
				if(num > 0) {
					pos ++;
				}
				
				if(num < 0) {
					neg ++;
				}
				
				if(num == 0) {
					zeros ++;
				}
			}
			
		}while(!s.equals("n"));
		
		System.out.println("Positives: " + pos);
		System.out.println("Negatives: " + neg);
		System.out.println("Zeros: " + zeros);

		
	}

}
