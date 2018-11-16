package arrayAssignments;

public class CountDuplicateStringElements {
	
	public static void main(String[] args) {
		
		String arr [] = {"banana","apple","banana","banana","peach","bluberry","banana"};
		String banana = "banana";
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(banana)) {
				count ++;
			}
		}
		
		System.out.println(count);
			
	}
}


