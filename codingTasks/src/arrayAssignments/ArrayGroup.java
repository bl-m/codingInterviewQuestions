package arrayAssignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayGroup {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter size of group: ");
		int size = in.nextInt();
		String arr [] = new String [size];
		
		for(int i = 0; i < size; i++) {
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Please enter member " +(i+1));
			String member = scan1.nextLine();
			arr[i] = member;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
