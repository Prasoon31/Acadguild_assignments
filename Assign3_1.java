package Java_Class3;

public class Assign3_1 {
	
	double Square_root (double num){		

		double number = Math.sqrt(num);
		return number;
		
	}

	double Cube_root (double num){		

		double number = Math.cbrt(num);
		return number;
		
	}

	public static void main(String[] args) {
		
		Assign3_1 obj1 = new Assign3_1();
		double i = obj1.Square_root(225);
		System.out.println("Square root value is:" + i);
		
		double j = obj1.Cube_root(125);
		System.out.println("Cube root value is:"+ j);

	}

}
