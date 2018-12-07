package arrayAssignments;

import java.util.Arrays;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int num1 = 55;
		int [] arr = {1,2,3,4,5,6,8,9,10};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(num1 - sum);	
	}

}
