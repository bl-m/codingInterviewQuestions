package arrayAssignments;

import java.util.Arrays;

public class CharacterArray {
	
	public static char [] initialize(String s) {
		
		char arr [] = s.toCharArray();
		System.out.println(Arrays.toString(arr));
		return arr;

	
	
}
	
	public static void main(String[] args) {
		
		String name = "james";
		initialize(name);

	}

}
