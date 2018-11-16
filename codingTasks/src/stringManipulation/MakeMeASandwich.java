package stringManipulation;

public class MakeMeASandwich {
	
	public static void main(String[] args) {
		
//		Ask user to enter two words. 
//		If the first word has even number of characters, 
//		print the first half of the
//		first word, print the second word and print the 
//		second half of the first word.
		
		String banana = "banana";
		String apple = "apple";
		String word = "";
		
		if(banana.length() % 2 == 0) {
			word = word + banana.substring(0, banana.length() /2) + apple + banana.substring(banana.length() /2);			
		}
		else {
			System.out.println(banana + " " + apple);
		}
		
		System.out.println(word);
	}

}
