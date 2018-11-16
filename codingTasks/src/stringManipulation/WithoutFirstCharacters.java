package stringManipulation;

public class WithoutFirstCharacters {
	
	public static void main(String[] args) {
		
		String word1 = "banana";
		String word2 = "apple";
		
		System.out.println(word1.substring(1).concat(word2.substring(1)));
	}

}
