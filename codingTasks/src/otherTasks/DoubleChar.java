package otherTasks;

public class DoubleChar {
	
	public static void doubleChar (String s) {
		
		String newWord = "";
		
		for(int i = 0; i < s.length(); i++) {
			newWord = newWord + s.substring(i, i+1) + s.substring(i, i+1);
		}
		
		System.out.println(newWord);
	}
	
	public static void main(String[] args) {
		
		doubleChar("Hello");
	}

}
