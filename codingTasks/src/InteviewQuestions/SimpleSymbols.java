package InteviewQuestions;

public class SimpleSymbols {
	
	public static void main(String[] args) {
		
		String str = "+d+=3=+s+h+";	
		char [] arr = str.toCharArray();
		
		
		for(int i = 0; i < arr.length-1; i++) {
			
			if(Character.isAlphabetic(arr[i])) {
				if(arr[i] == arr[0] || arr[i] == arr[arr.length -1]) {
					System.out.println(false);
				}
				
				if(arr[i - 1] != '+' && arr[i + 1] != '+') {
					System.out.println(false);
				}
			}			
		}	
		
		System.out.println(true);
	}	
}
