package arrayAssignments;

import java.util.Arrays;

public class InsertElementToThePositionOfSpecifcIndex {
	
	public static void main(String[] args) {
		
		int arr [] = {2,4,1,4,4,5};
		
		insertElement(arr,100,3);
		System.out.println("New String");
		
	}
	
	public static int [] insertElement(int arr [], int target, int index) {
		
		int newArr [] = new int [arr.length +1];
		
		for(int i = 0; i < index; i++) {
			newArr[i] = arr[i];		
		}
		
		newArr[index] = target;
				
		for(int x = index+1; x < newArr.length; x++) {
				newArr[x] = arr[x-1];
		}
		
		System.out.println(Arrays.toString(newArr));
		return newArr;
		
	}
}
