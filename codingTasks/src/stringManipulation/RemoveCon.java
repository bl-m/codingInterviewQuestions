package stringManipulation;

public class RemoveCon {
	
	public static void main(String args []) {
		
		String str = "programming";
		String target = "gra";
		
		if(str.length() < 3) {
			System.out.println("Invalid data");
			System.exit(0);
		}		
		if(str.split(" ").length > 1) {
			System.out.println("Invalid data");
			System.exit(0);
		}		
		StringBuilder myStr = new StringBuilder(str);
		
		for(int i = 0; i < myStr.length() -2; i++) {
			if(myStr.substring(i,i+3).equals(target)) {
				myStr.delete(i, i+3);
			}
		}
		System.out.println(myStr);;	
	}
}
