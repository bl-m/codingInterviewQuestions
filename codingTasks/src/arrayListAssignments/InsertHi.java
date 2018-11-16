package arrayListAssignments;

import java.util.ArrayList;

public class InsertHi {
	
	public static void main(String[] args) {
		
		String hi = "hi";
		
		ArrayList <String> list = new ArrayList<>();
		list.add("ai");
		list.add("apple");
		list.add("go");
		list.add("come");
		list.add("to");
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).length() == 2) {
				list.set(i, (list.get(i).charAt(0) + hi + list.get(i).charAt(1)));
			}
		}
		
		System.out.println(list);
	}

}
