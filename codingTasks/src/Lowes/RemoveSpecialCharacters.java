package Lowes;

public class RemoveSpecialCharacters {
	
	public static void main(String[] args) {
		
		String s = "talgat.abykeev@gmail.com";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
	
	}
}
