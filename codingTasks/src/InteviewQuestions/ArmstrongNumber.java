package InteviewQuestions;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int num=154;	
		int sum=0;
		int lastDigit;
		int temp=num;  
		
		while(num>0)
			
		{  
		
		lastDigit=num%10;  
		num=num/10;
		sum=sum+(lastDigit*lastDigit*lastDigit);
		
		}  
		
		if(temp==sum)  
		System.out.println("armstrong number");   
		else  
		System.out.println("Not armstrong number");   	    	
	}	
}
