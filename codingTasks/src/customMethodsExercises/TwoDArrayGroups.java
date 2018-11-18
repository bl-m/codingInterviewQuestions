package customMethodsExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayGroups {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter number of groups: ");
		int groups = in.nextInt();
		
		String arr [] [] = new String [groups][];
		
		for(int i = 0; i < groups; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter number of members for group " + (i+1));
			int g = scan.nextInt();
			
			for(int j = 0; j < g; j++) {
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Please enter group " + (i+1) + " member " +(j+1));
				
			}
		}	
		
		System.out.println(Arrays.toString(arr));
	}
}
