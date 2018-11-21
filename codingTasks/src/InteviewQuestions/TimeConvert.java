package InteviewQuestions;

public class TimeConvert {
	
	public static void main(String[] args) {
		
		int num = 126;
		
		int hours = num / 60;
		int min = num % 60;
		
		String s = "" + hours +":"+min;
		
		System.out.println(s);
	}

}
