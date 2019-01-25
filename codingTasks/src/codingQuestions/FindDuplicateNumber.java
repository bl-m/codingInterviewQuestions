package codingQuestions;

public class FindDuplicateNumber {
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,10,3};
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j] && i != j) {
					index = arr[i];
					break;
				}
			}
		}
		
		System.out.println(index);
		
 	}
}
