package customMethodsExercises;

import java.util.Arrays;

public class DoubleSizedArray {

	public static int [] doubleArray(int arr []) {
		
		int [] newArr = new int [arr.length * 2];
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));
		return newArr;
		
	}
	
	public static void main(String[] args) {
		
		int arr [] = {3, 2, 43, 2};
		doubleArray(arr);
	}
}
