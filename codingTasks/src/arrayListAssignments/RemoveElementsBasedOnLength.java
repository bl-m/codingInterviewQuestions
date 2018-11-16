package arrayListAssignments;

import java.util.ArrayList;

public class RemoveElementsBasedOnLength {
	
	public static ArrayList <String> removeElement(ArrayList <String> list, int size) {
		
		for(int i = list.size() -1; i >= 0; i--) {
			if(list.get(i).length() == size) {
				list.remove(list.get(i));
			}
		}

		System.out.println(list);
		return list;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("James");
		list.add("Adam");
		list.add("John");
		list.add("Elize");
		
		removeElement(list,5);
	}
}
