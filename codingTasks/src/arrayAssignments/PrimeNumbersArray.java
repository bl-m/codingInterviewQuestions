package arrayAssignments;

import java.util.Scanner;

public class PrimeNumbersArray {

	public static void main(String[] args) {
		
		int bound = 20;
		
		for(int i = 1; i < bound; i++) {
			
			boolean isPrime = true;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.print(i + " ");
			}
		}
	}
	
}
