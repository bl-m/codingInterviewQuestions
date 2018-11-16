package customMethodsExercises;

public class PrintNamesWithLastName {
	
//	Create a method that takes array of String 
//	—> Students list And returns array of String 
//	—> Students that has last names
//	Input: [“James”, “john”, “John Wick”, “Elize”] 
//	Output: [“John Wick”]
	
	public static void lastNames(String [] arr) {
		
		for(String x : arr) {
			 if(x.split(" ").length > 1) {
				 System.out.println(x);
			 }
		}

	}
	
	public static void main(String[] args) {
		
		String arr [] = {"James", "Peter Jackson,","john", "John Wick", "Elize","James Bond"};
		lastNames(arr);
	}

}
