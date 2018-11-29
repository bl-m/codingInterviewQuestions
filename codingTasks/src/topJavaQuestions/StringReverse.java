package topJavaQuestions;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String s = "Java is fun programming language";
		reverseAString(s);
		
	}
	
	public static void reverseAString(String s) {
		String rev = "";
		String splitted [] = s.split(" ");
		
		for(int i = splitted.length -1; i >= 0; i--) {
			rev = rev + splitted[i] + " ";
		}
		
		System.out.println(rev);
	}

}
