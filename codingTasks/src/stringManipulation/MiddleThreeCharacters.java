package stringManipulation;

public class MiddleThreeCharacters {
	
	public static void main(String[] args) {
		
		String s = "fifteen";
		int middle = s.length() / 2;
		System.out.println(s.substring(middle -1, middle + 2));
		
	}

}
