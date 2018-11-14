package schoolApp;

public class SchoolApp {
	
	public static void main(String[] args) {
		
		School s1 = new School();
		
		s1.enroll();
		System.out.println("------------------------");
		s1.payTution();
		System.out.println("------------------------");
		
		s1.unEnroll();
		
	}

}
