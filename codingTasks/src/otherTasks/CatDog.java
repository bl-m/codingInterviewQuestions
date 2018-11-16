package otherTasks;

public class CatDog {
	
	public static void main(String[] args) {
		

//		Write a Java program to input a string from 
//		user and prints true if ‘cat’ and ‘dog’ appears 
//		the same number of times in the given string.
		
		String s = "1cat1catodogcatdog";
		
		String cat = "cat";
		String dog = "dog";
		
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i < s.length() -2; i++) {
			if(s.substring(i, i+3).equals(cat)) {
				count1++;
			}
		}
		
		for(int i = 0; i < s.length() -2; i++) {
			if(s.substring(i, i+3).equals(dog)) {
				count2++;				
				}
		}
		
		if(count1 == count2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
