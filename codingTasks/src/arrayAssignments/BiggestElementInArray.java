package arrayAssignments;

public class BiggestElementInArray {

	public static void main(String[] args) {

		double [] arr = {0.2, 0.3, 3, 1.1, 1.5, 1.0};

		double biggest = 0;

		for(double x : arr) {
			if(biggest < x) {
				biggest = x;
			}
		}

		System.out.println(biggest);

	}

}
