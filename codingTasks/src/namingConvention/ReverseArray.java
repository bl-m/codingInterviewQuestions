package namingConvention;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5};
		reverseArray(arr);
		
		
	}
	
	public static void reverseArray(int [] arr) {
		
		int newArr [] = new int [arr.length];
		
		int b=0;
		for(int i = arr.length -1; i >=0; i--) {
			newArr[b] = arr[i];
			b++;
		}
		
		for(int x:newArr) {
			System.out.print(x+ " ");
		}
		
	}

}
