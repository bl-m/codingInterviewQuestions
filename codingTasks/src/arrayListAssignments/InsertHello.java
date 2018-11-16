package arrayListAssignments;

import java.util.ArrayList;

public class InsertHello {
	
	public static void main(String[] args) {
		
//		Create a method that accepts List of String. 
//		Iterate thought each element and check length. 
//		If element length is 2 insert word “hello” in the 
//		middle of string.
//		Input: [James, apple, go, come, to]
//		output: [James, apple, ghelloo, come, thelloo]
		
		ArrayList <String> list = new ArrayList<>();
		list.add("ai");
		list.add("apple");
		list.add("go");
		list.add("come");
		list.add("to");
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).length() == 2) {
				list.set(i, (list.get(i).charAt(0) + "hello" + list.get(i).charAt(1)));
			}
		}
		
		System.out.println(list);	
	}
}
