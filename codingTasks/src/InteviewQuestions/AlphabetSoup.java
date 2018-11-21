package InteviewQuestions;

import java.util.Arrays;
import java.util.Collections;

public class AlphabetSoup {
	
	public static void main(String[] args) {
		
		String str = "coderbyte";
		int [] arr2 = new int[str.length()];
		int [] arr3 = new int[str.length()];
		char [] arr4 = new char[str.length()];
		String finalString = "";



		
		for(int i = 0; i < str.length(); i++) {
			arr2[i] = (char)(str.charAt(i));
						
		}
		
		Arrays.sort(arr2);
		
		for(int i = 0; i < str.length(); i++) {
			arr3[i] = arr2[i];
						
		}
		
		for(int i = 0; i < str.length(); i++) {
			arr4[i] = (char)(arr3[i]);
						
		}
				
		for(int i = 0; i < str.length(); i++) {
			finalString = finalString + "" + (char)(arr3[i]);
						
		}
		
		System.out.println(finalString);
	}

}
