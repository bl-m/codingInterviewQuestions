package arrayAssignments;

import java.util.Arrays;

public class CopyElementsToAnotherArray {

	public static void main(String[] args) {

		String arr1 [] = {"one","two","three"};
		String arr2 [] = new String [arr1.length + 1];
		String four = "four";

		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}	

		arr2[arr2.length -1] = four;

		System.out.println(Arrays.toString(arr2));

	}

}
