package coderByte;

public class SurroundedByPlusSign {
	
	public static void main(String[] args) {
		
		String s = "+d+=3+y+=+s+8789";
		char arr [] = s.toCharArray();
		String newStr = "";
		boolean flag = true;
		
		
		for(int i = 0; i < arr.length -1; i++) {
			if(Character.isLetter(arr[i])) {
				if(!(arr[i-1] == '+' && arr[i+1] == '+')) {
					flag = false;
					break;
				}
			}
		}
		
		System.out.println(flag);
		
		
		
	}
}
