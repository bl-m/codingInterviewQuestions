package stringManipulation;

public class SMS {
	
//		Task 1:
//		-Create a string variable SMSmessage, assign following 
//		value:
//		"Sender:<Mike Smith>. From Number:[202-123-3456]. "
//		+ "Message:{I love programing and problem solving}"
//		-Create 3 string variables:
//		sender, phoneNumber,message
//		- by using indexOf and substring methods,
//		retrieve related information from SMSmessage 
//		string and assign to those 3 variables.
//		-print each variable in separate line
	
	public static void main(String[] args) {
		
		String SMSmessage = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
		
		String sender = SMSmessage.substring(SMSmessage.indexOf("<") + 1, SMSmessage.indexOf(">"));
		String phoneNumber = SMSmessage.substring(SMSmessage.indexOf("[")+1,SMSmessage.indexOf("]"));
		String message =SMSmessage.substring(SMSmessage.indexOf("{")+1, SMSmessage.indexOf("}"));
		
		System.out.println("Sender: " + sender);
		System.out.println("Phone number: " + phoneNumber);
		System.out.println("Message: " + message);
		
	}
	
}
