package arrayAssignments;

import java.util.Arrays;
import java.util.Random;

public class RandomValuesInArray {
	
//	Create a method that accepts integer(size) and integer(bound) and 
//	returns integer array.
//	Logic: method should create integer array and assign random values 
//	to each index. Random values must be up to given bound.
//	input: 4(desired array size),10(values bound)
//	Output: [2,9,7,7] —> random values assigned. Note: duplicate allowed
	
	
	public static int [] randomNumbers(int size, int bound) {
		
		Random r = new Random();
		int arr [] = new int [size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(bound);
		}
		
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public static void main(String[] args) {
		
		randomNumbers(5,100);
		
	}

}
