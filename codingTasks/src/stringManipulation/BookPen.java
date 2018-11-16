package stringManipulation;

public class BookPen {
	
	public static void main(String[] args) {
		
		String word1 = "ball";
		String word2 = "notebook";
		
		if(word1.length() == word2.length()) {
			System.out.println(word1+word2);
		}
		else {
			if(word1.length() > word2.length()) {
				System.out.println(word1.substring(0, word2.length()).concat(word2));
			}
			else {
				System.out.println(word2.substring(0, word1.length()).concat(word1));
			}
		}
	}

}
