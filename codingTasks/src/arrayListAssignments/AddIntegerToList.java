package arrayListAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class AddIntegerToList {
	
	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 4; i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("Enter your number: ");
			list.add(in.nextInt());
		}
		System.out.println(list);
	}
}
