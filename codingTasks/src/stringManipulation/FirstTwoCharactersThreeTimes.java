package stringManipulation;

public class FirstTwoCharactersThreeTimes {
	public static void main(String[] args) {
		
		String word = "apple";
		
		if(word.length() > 2) {
			System.out.println(word.substring(0, 2)+word.substring(0, 2)+word.substring(0, 2));
		}
		else {
			System.out.println(word);
		}
	}

}
