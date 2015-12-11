package Java_Class3;

import java.util.Random;
import java.util.Scanner;

public class Assign3_3 {

	int random_no_generator(int i){
		
		Random rnd = new Random();
		int rand_no = rnd.nextInt(i);
		
		return rand_no;
	}
	
	public static void main(String[] args) {

		System.out.println("You are about to generate a Random number");
		System.out.println("Enter any Integer:");
		Scanner sc = new Scanner (System.in);
		int k = sc.nextInt();
		
		Assign3_3 obj1 = new Assign3_3();
		
		int rand_no = obj1.random_no_generator(k);
		
		System.out.println( "Random number generated is: " + rand_no);
		
		sc.close();
	}

}
