package customClassExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Book2 {
	
	public static void main(String[] args) {
		
		ArrayList<Book1> list = new ArrayList<>();
		
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter number of books: ");
		int num = in1.nextInt();
		
		for(int i = 0; i < num; i++) {
			Scanner in2 = new Scanner(System.in);
			Book1 book = new Book1();
			System.out.println("Enter title for book " + (i+1));
			book.title = in2.nextLine();
			System.out.println("Enter author for book " + (i+1));
			book.author =in2.nextLine();
			
			list.add(book);
		}
		
		System.out.println(list.size());
	}

}
