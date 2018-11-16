package customClassExercises;

public class Computer {
	
//	Create a class Computer
//	Instance variables: model, color, memory, size, 
//	new(boolean)
//	Instance variables:
//	-> turnOn: void method, print “computer turning 
//	on” -> turnOff: 
//	void method, print “%model turning off”
	
	String model;
	String color;
	int memory;
	int size;
	boolean isNew;
	
	public void turnOff() {
		System.out.println(model + " turning off");
	}
	
	public void turnOn() {
		System.out.println(model + " turning on");
	}
	
	
	
	public static void main(String[] args) {
		
		Computer c = new Computer();
		c.model = "Mac";
		
		c.turnOff();
		c.turnOn();
		
	}
}
