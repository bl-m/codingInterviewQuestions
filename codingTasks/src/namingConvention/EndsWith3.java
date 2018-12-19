package namingConvention;

public class EndsWith3 {
	
	public static void main(String[] args) {
		
		int [] arr = {23,45,67,87,67,34,44,43};
		
		for(int x : arr) {
			if(x % 10 == 3) {
				System.out.println(x);
			}
		}
	}

}
