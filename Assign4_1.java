
public class Assign4_1 {

	public static void main(String[] args) {
		
		int[] array1 = {50, 1, -2, 31, -10, 12, 101, -24, 255, 9};
		
		System.out.println("Before Reversing");
		PrintArray (array1);
		
		// Reverse Array: array1
		Assign4_1 obj1 = new Assign4_1();
		array1 =  obj1.ReverseArray(array1);
		
		System.out.println("After Reversing");
		PrintArray (array1);


	}
	
	private static void PrintArray(int[] array2) {
		int i;
		for (i=0 ; i< array2.length; i++){
		System.out.print(array2[i]);
		System.out.print(" ");
			
		}
		System.out.println();
	}
	
	private int[] ReverseArray(int[] array3) {
		int[] array4 = new int[10];
		int k = array3.length;
		int m = k;
		for (int j=0;j < m; j++){
		
			array4[j] = array3[k-1];
			k--;
		}
		
		return array4;
	}

}
