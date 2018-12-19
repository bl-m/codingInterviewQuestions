package namingConvention;

public class MaxCountChar {
	
	public static void main(String[] args) {
		
		String str = "aadfdddcsscccccccsscc";
		System.out.println(countChars(str));
		
		
	}
	
	public static int countChars(String str) {
		
		 int count=0;
	        int maxCount=0;
	        for(int i=0; i<str.length(); i++) {
	            count=0;
	            for(int j=0; j<str.length(); j++) {
	                if(str.charAt(i)==str.charAt(j)) {
	                    count++;
	                }
	            }
	            if(maxCount<count) {
	                maxCount=count;
	            }
	            
	        }
	        
	        
	        return maxCount;
		
	}

}
