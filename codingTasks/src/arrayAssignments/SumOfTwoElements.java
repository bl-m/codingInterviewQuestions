package arrayAssignments;

import java.util.Arrays;

public class SumOfTwoElements {

	public static void main(String[] args) {

		double [] arr = {0.2, 0.3, 1.1, 1.5, 1.0};

		for(int i = 0; i < arr.length -1; i++) {
			if(arr[i] + arr[i + 1] == 2.5) {
				System.out.println(arr[i] + arr[i+1]);
			}

		}

	}

}
