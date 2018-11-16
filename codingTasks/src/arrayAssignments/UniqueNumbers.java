package arrayAssignments;

import java.util.Arrays;

public class UniqueNumbers {

	public static void main(String[] args) {

		//		Given an array of ints nums
		//		[1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4]
		//		Using a nested loop print only values that appear once
		//		(true meaning of unique):
		//		1 44 12 20 33
		//		Do not use any strings!

		int arr [] = {1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4};
		
		boolean [] visited = new boolean[arr.length];
		
        for (int i = 0; i <arr.length ; i++) {
            int x = arr[i];
            if(visited[i]==false) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (x == arr[j]) {
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
                if (!isDuplicate)
                    System.out.print(x + " ");
            }
        }
    }		
}

