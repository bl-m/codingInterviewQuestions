package otherTasks;

public class MilesToKilometer {
	
	public static void main(String[] args) {
		
		double mile = 1.609;
				
		System.out.println("Mile \t Kilometer");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i +"        "+ mile*i);
		}
	}

}
