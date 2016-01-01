import java.util.Arrays;
import java.util.Scanner;

public class Assign4_2 {

	
   public int[] insert_element_in_array (int elem, int[] arr1) {
		
		int i=0;
		int[] arr2 = new int[11];
		
		if (elem  > arr1[arr1.length - 1]) {
			int k =0;
			while (k < arr1.length){
				arr2[k] = arr1[k];
				k++;
			}
			arr2[k] = elem;
			
		} else {		
		   while (elem >= arr1[i]){
			   arr2[i] = arr1[i];
			   i++;
		   }		
		   arr2[i] = elem;
		   while (i < arr1.length){
			   arr2[i+1] = arr1[i];
			   i++;
		   }
		}
		
		return arr2;
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = {50, 1, -2, 31, -10, 12, 101, -24, 255, 9};
		
		//Sort Array arr1 and print
		System.out.println("Before Sorting:");
		PrintArray (arr1);

		Arrays.sort(arr1);
		System.out.println("After Sorting:");
		PrintArray (arr1);
		
		// Insert Element in array arr1 and print
		System.out.println("Enter any Integer to be inserted in the Array");
		Scanner sc = new Scanner (System.in);
		int element = sc.nextInt();

		Assign4_2 obj1 = new Assign4_2();		
		int[] new_array = obj1.insert_element_in_array(element, arr1);
		
		System.out.println("");
		System.out.println("After inserting element: " + element +", final array is:");
		PrintArray (new_array);
	}
	private static void PrintArray(int[] array2) {
		int i;
		for (i=0 ; i< array2.length; i++){
		System.out.print(array2[i]);
		System.out.print(" ");
			
		}
		System.out.println();
	}

}
