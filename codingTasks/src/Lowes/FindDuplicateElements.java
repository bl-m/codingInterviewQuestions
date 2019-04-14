package Lowes;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {
	
	public static void main(String[] args) {
		
		String arr [] = {"ball", "pen", "pencil", "phone", "ball","pen"};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
		System.out.println("---------");
		
		Set<String> set = new HashSet<String> ();
		
		for(String x : arr) {
			if((set.add(x)) == false) {
				System.out.println(x);
			}
		}
			
	}

}
