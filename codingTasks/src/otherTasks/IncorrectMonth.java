package otherTasks;

import java.util.Scanner;

public class IncorrectMonth {
	
	public static void main(String[] args) {
		
		int x;
		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter number of a month: ");
			x = in.nextInt();
			
		}while(x <= 12 && x > 0);
		
		System.out.println("You entered an incorrect number.");
		
	}

}
