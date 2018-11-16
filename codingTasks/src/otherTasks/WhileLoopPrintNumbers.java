package otherTasks;

public class WhileLoopPrintNumbers {
	
	public static void main(String[] args) {
		
		int num1 = 1;
		while(num1 <= 20) {
			System.out.print(num1 + " ");
			num1++;
		}
		
		System.out.println();
		System.out.println("------------------------------------------------");
		
		int num2 = 1;
		while(num2 <= 20) {
			if(num2 % 2 == 0) {
				System.out.print(num2 + " ");
			}
			num2++;
		}
		System.out.println();
		System.out.println("------------------------------------------------");
		
		int num3 = 1;
		while(num3 <= 20) {
			if(num3 % 3 == 0) {
				System.out.print(num3 + " ");
			}
			num3++;
		}
		System.out.println();
		System.out.println("------------------------------------------------");
		
		int num4 = 1;
		while(num4 <= 20) {
			if(num4 % 2 != 0) {
				System.out.print(num4 * num4 + " ");
			}
			num4++;
		}	
		
		System.out.println();
		System.out.println("------------------------------------------------");
	
		for(int i = 1; i < 20; i++) {
			System.out.print(i + " + ");
		}
		System.out.println(20);
		
		System.out.println("------------------------------------------------");
		
		int sum = 0;
		int i = 1;
		while(i<=20) {
			if(i % 2 == 0) {
				sum = sum + i;
			}	
			i++;
		}	
		System.out.println(sum);
		
		System.out.println("------------------------------------------------");
				
		int x = 1;
		int sum1 = 0;
		
		while(x <= 19) {
			if(x % 2 != 0) {
				sum1 = x + sum1;
				System.out.print(sum1 + " ");
			}	
			x++;
		}	
	}
}
