package Java_Class3;

import java.util.Scanner;

public class Assign3_2 {

	boolean Check_Prime(int num){
		int i = 2;
		boolean True = true;
		boolean False = false;
		while (i<= num/2){
			int j = num%i;
			if (j == 0){
				break;
			}
		    if (i == num/2){
			   return True;
		    }
		    i++;
		}
		
		return False;
		
	}
	
	public static void main(String[] args) {

		System.out.println("Enter any Integer to check if it is a Prime number");
		Scanner sc = new Scanner (System.in);
		int k = sc.nextInt();
		
		Assign3_2 prime =  new Assign3_2();
		boolean is_prime = prime.Check_Prime(k);
		
		if (is_prime == true){
			
			System.out.println( "Number is Prime");
		} else {
			System.out.println("Number is Not Prime");
			
		}
		sc.close();
		
	}

}
