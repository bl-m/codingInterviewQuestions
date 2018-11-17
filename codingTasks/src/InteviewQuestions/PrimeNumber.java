package InteviewQuestions;

import java.util.ArrayList;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		isPrime(20);
		
	}
	
	public static ArrayList<Integer> isPrime(int bound) {
		
		boolean isPrime = false;
		ArrayList<Integer> list = new ArrayList<>();

		for(int i = 2; i <= bound; i++) {
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
				else {
					isPrime = true;
				}
			}
			
			if(isPrime == true) {
//				System.out.println(i);
				list.add(i);
			}
		}
		System.out.println(list);
		return list;
		
	}

}
