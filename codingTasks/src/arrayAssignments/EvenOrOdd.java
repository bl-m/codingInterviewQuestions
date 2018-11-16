package arrayAssignments;

import java.util.Arrays;

public class EvenOrOdd {
	
//	Write a program called IncrementArrayValues:
//		1. Declare array nums and assign {1,2,3,4,5,6,7,8,9}
//		2. Print out all values in single line separated by space:
//		1 2 3 4 5 6 7 8 9
//		3. Using a Loop write some code to do the following:
//		       if the value is even - double it and assign back. 
//		If the value is odd - triple it and assign back.
//		4. Print out all values in single line separated by space:
//		3 4 9 8 15 12 21 16 27
	
	
	public static void main(String[] args) {
	
	 int arr [] = {1,2,3,4,5,6,7,8,9};
	 
	 for(int x : arr) {
		 System.out.print(x + " ");
	 }
	 System.out.println();
	 
	 for(int i = 0; i < arr.length; i++) {
		 if(arr[i] % 2 != 0) {
			 arr[i] = arr[i] * 3;
		 }
		 else {
			 arr[i] = arr[i] * 2;
		 }
	 }
	 String nums = Arrays.toString(arr).replaceAll(",","");
	 nums = nums.substring(1, nums.length() -1);
	 System.out.println(nums); 
	 
	}	
}
