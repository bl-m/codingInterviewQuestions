package InteviewQuestions;

public class LongestWord {
	
	public static void main(String[] args) {
		
		String sen = "fun&!! time time book proga";
		int c = 0;
		String arr [] = sen.split(" ");
		int count = 0;
		String s = "";
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length(); j++) {
				if(Character.isAlphabetic(arr[i].charAt(j))) {
					c++;
				}	
			}
			
			if(c > count) {
				count = c;
				c = 0;
			}
		}
		
		System.out.println(count);
	}
}
