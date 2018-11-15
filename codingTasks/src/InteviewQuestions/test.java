package InteviewQuestions;

import java.util.ArrayList;

public class test {
	
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList<>();
		list.add("hey");
		list.add("yo");
		list.add("man");
		list.add("yau");
		list.add("yo");

		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals("yo")) {
				list.remove("yo");
			}
		}
		
		System.out.println(list);
		
	}

}
