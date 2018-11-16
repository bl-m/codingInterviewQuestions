package InteviewQuestions;

public class VowelOrConsonant {

	//	Write a Java program that takes the user to provide a single 
	//	character from the alphabet. Print Vowel or Consonant, depending 
	//	on the user input. If the user input is not a letter (between a and z or A 
	//			and Z), or is a string of length > 1, print an error message.
	//	Input:
	//	Input an alphabet: b
	//	Output :
	//	Input letter is Consonant

	public static void isVowel(char c) {

		if (Character.isLetter(c)) {

			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U' || c == 'y' || c == 'Y') {
				System.out.println(c + " is Vowel");

			} else {
				System.out.println("Letter is Consonant");
			}
		} else {
			System.out.println("Letter is not alphabetical character");
		}

	}

	public static void main(String[] args) {

		isVowel('x');
	}

}
