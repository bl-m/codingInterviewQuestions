package namingConvention;

public class Division {
	public static void main(String[] args) {
		
		divisionDetails(10,3);
		
	}
	
	 public static void divisionDetails(int number, int divisor) {
	        
	        int quotient = 0;
	        int remainder;
	        
	        while(number>=divisor) {
	            number = number - divisor;
	            quotient++;
	        }
	        remainder = number;
	        
	        System.out.println(quotient + ", " + remainder);
	        
	    }
	 

}
