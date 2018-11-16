package stringManipulation;

public class ChangeLastTwoCharacters {
	
	public static void main(String[] args) {
		
//		Ask user to enter a word. If the word has 2 or more 
//		characters, print the word. But print by changing the
//		places of the last two characters.
		
		String word = "Hello";
		
		if(word.length() > 2) {
			System.out.println(word.substring(0, word.length() -2)+ 
					word.charAt(word.length() -1) + word.charAt(word.length() -2));
		}
		else {
			System.out.println(word);
		}
	}

}
