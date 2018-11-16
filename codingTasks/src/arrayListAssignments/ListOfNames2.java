package arrayListAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfNames2 {
	
	public static void main(String[] args) {
		
//		Create a program that asks names from user 
//		using Scanner and keep adding each name to list. 
//		Then ask user if user wants to continue adding names 
//		and keep adding to the list. In the end print names.
		
		String s;
		ArrayList <String> list = new ArrayList<>();
		do {
			Scanner in1 = new Scanner(System.in);
			System.out.println("Please enter name: ");
			String str = in1.nextLine();
			
			Scanner in2 = new Scanner(System.in);
			System.out.println("Continue?: y/n");
			s = in1.nextLine();
			
			if(s.equals("y")) {
				list.add(str);
			}
			
			else {
				list.add(str);
				break;
			}
			
		}while(!s.equals("n"));
		System.out.println(list);
	}
}
