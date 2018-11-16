package customMethodsExercises;

import java.util.Random;

public class GenerateUserName {
	
	public static void main(String[] args) {
		
		
		System.out.println(username("wilson"));;
		
	}
	
	public static String username(String s) {
		
		Random r = new Random();
		String str = "";
		String arr [] = s.split(" ");
		if(arr.length > 1) {
			for(String x : arr) {
				str = str + x;
			}
		}
		
		if(arr.length == 1) {
			str = s.toLowerCase();
		}
		
		int i = r.nextInt(100);
		return str+""+i+"".toLowerCase();
		
	}
 
}
