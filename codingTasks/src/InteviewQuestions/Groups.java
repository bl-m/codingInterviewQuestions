package InteviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Groups {
	
	public static void main(String[] args) {
		
		System.out.println("Enter number of groups: ");
		Scanner in = new Scanner(System.in);
		int groups = in.nextInt();
		
		String arr [][] = new String [groups][];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter number of members in group " + (i+1));
			int numOfMember = in.nextInt();
			
			arr[i] = new String[numOfMember];
			
			for(int j = 0; j < numOfMember; j++) {
				System.out.println("Group " + (i+1) + " member " + (j+1));
				Scanner scan = new Scanner(System.in);
				arr[i][j] = scan.next();;			
			}
		}		
		System.out.println(Arrays.toString(arr));
	}
}
