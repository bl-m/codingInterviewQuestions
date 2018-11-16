package otherTasks;

import java.util.Scanner;

public class PrintInputUntilExit {
	
	public static void main(String[] args) {
		
		
		String s = "";
		do {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Write something: ");
			s = in.nextLine();
			System.out.println("You wrote " + s);
			
		}while(!s.equals("exit"));
	}

}
