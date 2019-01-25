package mockInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RunnerClass {
	
	public static void main(String[] args) {
				
		fibonacciOrNot(8);
	}
	
	public static void Fibonacci(int num) {
		
		int a = 0;
		int b = 1;
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		int c = a + b;
		System.out.print(c + " ");
		
		while(c < num) {
			
			a = b;
			b = c;
			c = a+b;
			
			if(c > num) {
				break;
			}
			
			System.out.print(c + " ");		
		}		
	}
	
	public static void fibonacciOrNot(int num) {
		
		int a = 0;
		int b = 1;
		
	
		
		int c = a + b;
		
		while(c < num) {
			
			a = b;
			b = c;
			c = a+b;
			
			if(c > num) {
				break;
			}
			
		}	
		
		if(c == num) {
			System.out.println(num + " is Fibonacci");
		}
		else {
			System.out.println(num + " is not Fibonacci");
		}
		
	}
	
	
	public static void isPrime(int num) {
		
		boolean flag = true;
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println(num + " is prime");
		}
		else {
			System.out.println(num + " is not prime");
		}
	}
	
	public static void isStringPalindrome(String s) {
		
		
		String rev = "";
		
		for(int i = s.length() -1; i >=0; i--) {
			rev = rev + s.charAt(i);
		}
		
		if(s.equals(rev)) {
			System.out.println(s + " is Palindrome");
		}
		else {
			System.out.println(s + " is not a Palindrome");
		}
	}
	
	public static void isIntegerPalindrome(int num) {
		
		int temp = num;
		int rem = 0;
		int sum = 0;
		
		while(num > 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		
		System.out.println(sum);
	}	
	
	public static void isNumberArmstrong(int num) {
		
		int temp = num;
		int rem = 0;
		int sum = 0;
		
		while(num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		
		if(temp == sum) {
			System.out.println(temp + " is an Armstrong number");
		}
		else {
			System.out.println(temp + " is not an Armstrong");
		}	
	}	
	
	public static void findFactorial(int num) {
		
		int sum = 1;
		for(int i = num; i > 0; i--) {
			sum = sum * i;
		}
		
		System.out.println(sum);
	}
	
	public static void isPalindromeWithSB(String str) {
		
		StringBuilder s = new StringBuilder(str);
		if(s.reverse().toString().equals(str)) {
			System.out.println(str + " is palindrome");
		}
		else {
			System.out.println(str + " is not a palindrome");
		}		
	}
	
//	Output List of duplicate characters in String 'Programming' 
//	g : 2 
//	r : 2 
//	m : 2

	public static void printRepeatedCharacter(String str) {
			         
	        Map<Character, Integer> dupMap = new HashMap<Character, Integer>(); 
	        char[] chrs = str.toCharArray();
	        for(Character ch:chrs){
	            if(dupMap.containsKey(ch)){
	                dupMap.put(ch, dupMap.get(ch)+1);
	            } else {
	                dupMap.put(ch, 1);
	            }
	        }
	        
	        Set<Character> keys = dupMap.keySet();
	        for(Character ch:keys){
	            if(dupMap.get(ch) > 1){
	                System.out.println(ch+"--->"+dupMap.get(ch));
	         }
	    }	     	
	}
	
	public static void findGcd(int num1, int num2) {		
		
		int gcd = 0;
		
		for(int i = 1; i <= num1 && i <= num2; i++) {
			if(num1%i==0 && num2%i==0) {
				gcd = i;
			}
		}
		
		System.out.println(gcd);
	}	
	
	public static void AnagramNumber(int num1, int num2) {
		
		String n1 = Integer.toString(num1);
		String n2 = Integer.toString(num2);
		
		char [] arr1 = n1.toCharArray();
		char [] arr2 = n2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		boolean b = true;
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				b = false;
			}
		}
		
		if(b == true) {
			System.out.println("Numbers are anagram");
		}
		else {
			System.out.println("Numbers are not an anagram");
		}

	}
	
	public static int countLetterNumbers(String str) {
		
		char [] arr = str.toCharArray();
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i])) {
				count ++;
			}
		}
		
		return count;
	}
	
	public static void missingNumber() {
		
	
	int[] numbers = { 1, 2, 5, 8, 10 };
    for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i] == numbers[i + 1] - 1) {
            continue;
        } else {
            for (int j = 1; j < numbers[i + 1] - numbers[i]; j++) {
                System.out.print(numbers[i] + j + " ");
            	}
        	}
    	}	
	}
	
	
	
	
	
	
}
