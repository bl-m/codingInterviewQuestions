package arrayAssignments;

import java.util.Arrays;

public class InitializeElementsWithGivenValue {
	
//	Create method that accepts integer array and integer(target value) 
//	and returns integer array.
//	Logic: Method should initialize all the elements with given target 
//	integer value.
//	Input: [1,4,23,4,0], 10 Output: [10,10,10,10,10]
	
	public static int [] initialize(int arr [], int element) {
		int newArr [] = new int [arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = element;
		}
		
		System.out.println(Arrays.toString(newArr));
		return newArr;
	}
	
	public static void main(String[] args) {
		
		int [] arr = {1,4,23,4,0};
		initialize(arr,10);
		
	}
}
