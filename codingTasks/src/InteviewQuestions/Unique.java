package InteviewQuestions;

import java.util.Arrays;

public class Unique {
	
	public static void main(String[] args) {
		
		int inner =5;
	    int outer =5;
	    for(int i=0; i<=inner; i++){
	      for(int j =0; j<=outer; j++){
	        if(i==0 || i==inner){
	          System.out.print("*");
	        }else{
	          if(j==0 || j==outer){
	            System.out.print("*");
	              
	             }else {
	              System.out.print(" ");
	            }
	          }
	          
	        }System.out.println();
	    }
	
	}

}
