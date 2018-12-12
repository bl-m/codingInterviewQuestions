package InteviewQuestions;

public class CountCharacterInAString {
	
	public static void main(String[] args) {
		
		String s = "ibraiym";
		s = s.toLowerCase();
		String u = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(!u.contains(s.substring(i,i+1))) {
				u = u + s.substring(i,i+1);
				System.out.print(s.charAt(i) + ":" + countCharacters(s, s.charAt(i)) + " ");

			}
		}
	
	}
	
	public static int countCharacters(String s, char c) {
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c) {
				count ++;
			}
		}
		
		return count;
	}

}
