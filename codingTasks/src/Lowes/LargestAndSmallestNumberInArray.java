package Lowes;

public class LargestAndSmallestNumberInArray {
	
	public static void main(String[] args) {
		
		int arr [] = {4,6,2,2,5,7,3,56,677,80,9};
		int largest = arr[0];
		int smallest = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			else if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
		
	}
}
