package otherTasks;

public class DuplicatedWordInString {
	
	public static void main(String[] args) {
		
		String str = "Hi ABChi hi Chicago hi";
		str = str.toLowerCase();
		int count = 0;
		
		for(int i = 0; i < str.length() -1; i++) {
			if(str.substring(i, i+2).equals("hi")) {
				count ++;
			}
		}
		
		System.out.println(count);
	}
}
