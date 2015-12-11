package Java_Class3;

import java.util.Scanner;

public class Assign3_4 {

	
	int addition(int num1, int num2) {
		
		int result = num1 + num2;
		return result;
		
	}
	
	int sustraction(int num1, int num2) {

		int result = num1 - num2;
		return result;

	}

	long multiplication(int num1, int num2) {

		long result = num1 * num2;
		return result;

	}

	float division(float num1, float num2) {

		float result = num1/num2;
		return result;

	}
		

	public static void main(String[] args) {
	
		System.out.println("1st Integer :");
		Scanner sc = new Scanner (System.in);
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter + or - or * or /");
		char operator = sc.next(".").charAt(0);
		
		System.out.println("2nd Integer :");
		int num2 = sc.nextInt();
				
		Assign3_4 obj1 = new Assign3_4();
		
		switch (operator) {
		 
		 case '+':
			 int add_result =  obj1.addition(num1, num2);
			 System.out.println("Addition result is: " + add_result);
			 break;
		 case '-':
			 int sub_result =  obj1.sustraction(num1, num2);
			 System.out.println("sustraction result is: " + sub_result);
			 break;
		 case '*':
			 long mult_result =  obj1.multiplication(num1, num2);
			 System.out.println("multiplication result is: " + mult_result);
			 break;
		 case '/':
			 float div_result =  obj1.division(num1, num2);
			 System.out.println("division result is: " + div_result);
			 break;
	     default:
	    	 System.out.println("Please enter a valid Operator");
	    	 break;
	     
		 }
		sc.close();
		
	}

}
