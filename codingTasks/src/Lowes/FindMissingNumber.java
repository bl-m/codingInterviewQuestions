package Lowes;

public class FindMissingNumber {
	
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6,7,8,10};
		
		int sum = 0;
		int num = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		for(int j = 0; j <= arr[arr.length -1]; j++) {
			num = num + j;
		}
		
		System.out.println("Missing number is: " + (num - sum));
	}
}
