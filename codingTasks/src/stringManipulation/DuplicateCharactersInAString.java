package stringManipulation;

import java.util.ArrayList;

public class DuplicateCharactersInAString {
	
	public static void main(String[] args) {
		
		String s = "programming";
		
		dup(s);
		
		
	}
	
	public static void dup(String s) {
		
		char [] arr = s.toCharArray();
		int count = 0;
		ArrayList <Character> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j] && i != j) {
					if(!list.contains(arr[i])) {
						list.add(arr[i]);
					}
				}
			}
		}
		System.out.println("Dupliccated characters are: " + list);			
	}
}
