package InteviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateArray {
	
	public static void main(String[] args) {

	int arr [] =  {2,3,4,100,54,32,100};
	int newArr [] = new int [arr.length -1];
	
	
	int a = 0;
	for(int i = 0; i < arr.length; i++) {
		int num = findElement(arr[i],arr);
		if(num == 1) {
			newArr[a] = arr[i];
			a++;
		}
		else {
			newArr[a] = arr[i];
		}

	}
	
	System.out.println("New Array");
	System.out.println(Arrays.toString(newArr));
	
	System.out.println(findElement(100,arr));
		
	
}	
	
	
	public static int findElement(int num, int [] arr) {
		
		int count = 0;
		for(int x : arr) {
			if(x == num) {
				count ++;
			}
		}
		
		return count;
		
	}
}
