package arrayAssignments;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		double sum = 0;
		double [] arr = {0.2, 0.3, 1.1, 1.5, 1.0};


		for(double x : arr) {
			sum = sum + x;
		}

		System.out.println(sum);
	}

}
