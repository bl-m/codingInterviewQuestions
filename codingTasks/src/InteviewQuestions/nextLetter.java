package InteviewQuestions;

public class nextLetter {
	
	public static void main(String[] args) {
		
		
		String str = "hello*3";
		String newString = "";
		int ascii = 0;
				
		for(int i = 0; i < str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
							
				ascii = (int)str.charAt(i);
				
				newString = newString + "" + (char)(ascii+1); 					
				}
			
			else {
				
				newString = newString + "" + str.charAt(i);
			}		
		}
		
		String s = "";
		int asc;
				
		for(int i = 0; i < newString.length(); i++) {
			
			if(newString.charAt(i) == 'a' || newString.charAt(i) == 'e' || 
					newString.charAt(i) == 'i' || newString.charAt(i) == 'o' || 
							newString.charAt(i) == 'u' || newString.charAt(i) == 'A') {
				
			asc = (int)newString.charAt(i);
			s = s + "" + (char)(asc - 32); 	
				
				
			}
			else {
				s = s + "" + newString.charAt(i);
			}
		}
		
		System.out.println(s);
		
	}	
}