package InteviewQuestions;

public class KaprekarsConstant {
	
	public static int Largest(int num) {
		
		 // hashed array to store count of digits 
        int count[] = new int[10]; 
          
        // Converting given number to string 
        String str = Integer.toString(num); 
          
        // Updating the count array 
        for(int i=0; i < str.length(); i++) 
            count[str.charAt(i)-'0']++; 
          
        // result is to store the final number 
        int result = 0, multiplier = 1; 
          
        // Traversing the count array 
        // to calculate the maximum number 
        for (int i = 0; i <= 9; i++) 
        { 
            while (count[i] > 0) 
            { 
                result = result + (i * multiplier); 
                count[i]--; 
                multiplier = multiplier * 10; 
            } 
        } 
        
        return result;
	}
	
	public static int Smallest(int num) {
		
	     int[] freq = new int[10]; 
	       
	        // count frequency of each digit in the number 
	        while (num > 0) 
	        { 
	            int d = num % 10; // extract last digit 
	            freq[d]++; // increment counting 
	            num = num / 10; //remove last digit 
	        } 
	       
	        // Set the LEFTMOST digit to minimum expect 0 
	        int result = 0; 
	        for (int i = 1 ; i <= 9 ; i++) 
	        { 
	            if (freq[i] != 0) 
	            { 
	                result = i; 
	                freq[i]--; 
	                break; 
	            } 
	        } 
	       
	        // arrange all remaining digits 
	        // in ascending order 
	        for (int i = 0 ; i <= 9 ; i++) 
	            while (freq[i]-- != 0) 
	                result = result * 10 + i; 
	       
	        return result;
		
	}
	
	
	
	public static void main(String[] args) {
		
		int num = 3524;
		int res = 0;
		int count = 0;
		
		do {
			res = Largest(num) - Smallest(num);
			res = Largest(res) - Smallest(res);
 			count ++;
			
			
			
		}while(res != 6174);
		
		
		System.out.println(count);

	}

}
