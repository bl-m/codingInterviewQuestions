package otherTasks;

public class MiddleCharacter {
	
//	Write a Java method to display the middle character 
//	of a string. Go to the editor
//	a) If the length of the string is even there will be 
//	two middle characters.
//	b) If the length of the string is odd there will be 
//	one middle character.
//
//	Input:
//	Input a string: elephant 
//	Output:
//	The middle character in the string: ph
	
	public static void main(String[] args) {
		
		String s = "elephants";
		int middle = s.length() / 2;
		
		if(s.length() % 2 != 0) {
			System.out.println(s.charAt(middle));
		}
		else {
			System.out.println(s.substring(middle-1, middle+1));
		}	
	}
}
