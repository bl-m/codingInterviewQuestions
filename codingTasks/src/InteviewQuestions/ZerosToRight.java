package InteviewQuestions;

import java.util.Arrays;

public class ZerosToRight {
	
	public static void main(String[] args) {
		
		int arr [] = {3,5,0,1,0,2,0,5};
		
		for(int i = 0; i < arr.length -1; i++) {
			int x = arr[i];
			if(arr[i] == 0 && arr[i+1] != 0) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}

