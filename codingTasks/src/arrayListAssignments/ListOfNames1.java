package arrayListAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfNames1 {
	
	public static void main(String[] args) {
		
//		Create a program that asks 5 names from user 
//		using Scanner and keep adding each name to 
//		List of String collection. 
//		And print out list of names in the end.
		ArrayList <String> arr = new ArrayList <>();
		
		for(int i = 0; i < 5; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter name: ");
			String s = in.nextLine();
			arr.add(s);
		}
		
		System.out.println(arr);
	}

}
