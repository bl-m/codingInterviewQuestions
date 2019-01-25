package otherTasks;

public class IntegerPalindrome {
	
	public static void main(String[] args) {
		
	int arr [] = {1,2,5,2,1,3,3,4,2,23,45,43};
	// Save all unique elements in another array
	int count = 0;
	
	for(int i = 0; i < arr.length; i++) {
		int temp = arr[i];
		for(int j = 0; j < arr.length; j++) {
			if(temp != arr[j] && i != j) {
				count ++;
				
				}
			}
		}	
	
	System.out.println(count);
	System.out.println(arr.length);
	
	}
}
