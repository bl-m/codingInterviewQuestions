package InteviewQuestions;

public class nextLetter {
	
	public static void main(String[] args) {
		
		
		String string = "hel$#%no";
		String newString = "";
		int ascii = 0;
				
		for(int i = 0; i < string.length(); i++) {
			if(Character.isAlphabetic(string.charAt(i))) {
							
				ascii = (int)string.charAt(i);
				
				newString = newString + "" + (char)(ascii+1); 					
				}
			
			else {
				
				newString = newString + "" + string.charAt(i);
			}		
		}
		System.out.println(newString);
		
		String s = "";
		int asc;
				
		for(int i = 0; i < newString.length(); i++) {
			
			if(newString.charAt(i) == 'a' || newString.charAt(i) == 'e' || 
					newString.charAt(i) == 'i' || newString.charAt(i) == 'o' || 
							newString.charAt(i) == 'u' || newString.charAt(i) == 'A') {
				
			asc = (int)string.charAt(i);
			s = s + "" + (char)(asc - 32); 	
				
				
			}
			else {
				s = s + "" + string.charAt(i);
			}
		}
		
		System.out.println(s);
		
	}	
}