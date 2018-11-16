package stringManipulation;

import java.util.Arrays;

public class UniqueCharactersInAString {
	
	public static void main(String[] args) {
		
		String first="javaaavavaq";
		String newFirst="";
		
		for(int i=0;i<first.length();i++)
		{ 
		     if(newFirst.indexOf(first.charAt(i))==-1)
		      newFirst+=first.charAt(i);
		}
		System.err.println("The Unique Charactes in the String:"+newFirst);

	}

}
