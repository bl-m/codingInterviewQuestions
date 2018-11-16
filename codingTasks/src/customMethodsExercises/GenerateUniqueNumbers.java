package customMethodsExercises;

import java.util.Arrays;
import java.util.Random;

public class GenerateUniqueNumbers {
	
//	Create method that generates unique random 
//	numbers and returns in integer array Input: 
//	2 parameters -> 1- integer for size, 2- integer 
//	for bound
//	Output: integer array
	
	public static int [] randomNumbers (int size, int bound) {
		
		Random r = new Random();
		int arr [] = new int [size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = r.nextInt(bound);
		}
		
		System.out.println(Arrays.toString(arr));
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		randomNumbers(5,100);
	}

}
