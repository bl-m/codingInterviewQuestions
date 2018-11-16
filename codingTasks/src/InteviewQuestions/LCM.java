package InteviewQuestions;

import java.util.Scanner;

public class LCM {
	
	public static void main(String[] args) {
		
//		Write a Java program to input two numbers from 
//		user and find LCM (Lowest Common Multiple).
//		LCM is a smallest positive integer that exactly 
//		divides two or more numbers. For Example, the LCM 
//		of 16 and 20 is 80; 80 is the smallest number that is 
//		both a multiple of 16 and a multiple of 20.
		
		int num1 = 9;
		int num2 = 145;
		
		int lcm = (num1 > num2) ? num1:num2;

		while(!(lcm % num1 == 0 && lcm % num2 == 0)) {
			lcm++;
		}
		
		System.out.println(lcm);
	}

}
