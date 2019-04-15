package Lowes;

public class Prime {
	
	public static void main(String[] args) {
		
		int num =20;
		boolean f = false;
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				f = true;
				break;
			}
		}
		
		if(f == false) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
		
		
	}

}
