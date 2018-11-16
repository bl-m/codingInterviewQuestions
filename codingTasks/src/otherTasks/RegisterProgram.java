package otherTasks;

import java.util.Scanner;

public class RegisterProgram {
	
	public static void main(String[] args) {
		
//		How many items are you purchasing?
//				2
//				What is item 1?
//				Gloves
//				How much is Gloves?
//				10.44
//				What is item 2?
//				Hat
//				How much is Hat?
//				13
//				----------
//				Your items: Gloves, Hat
//				Your total Price: $23.44
		
		Scanner in1 = new Scanner(System.in);
		System.out.println("How many items are you purchasing?");
		int num = in1.nextInt();
		String items = "";
		int total = 0;
		
		for(int i = 0; i < num; i++) {
			Scanner in2 = new Scanner(System.in);
			System.out.println("What is item " + (i+1) + "?");
			String item = in2.nextLine();
			items = items + item + " ";
			
			Scanner in3 = new Scanner(System.in);
			System.out.println("How much is " + item + "?");
			int price = in3.nextInt();
			total = total + price;		
		}
		
		System.out.println("Your items: " + items);
		System.out.println("Your total: " + total);
	}

}
