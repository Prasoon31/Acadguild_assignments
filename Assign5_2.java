package Session5_2;

import Session5_pkg.Residencial_bldg;
import Session5_pkg.School_bldg;

public class Assign5_2 {

	public static void main(String[] args) {
		School_bldg obj1 = new School_bldg();
		
		obj1.show_type();
		int i = obj1.no_of_floors();
		System.out.println("No of Floors: "+ i);
		
		System.out.println("");
		Residencial_bldg obj2 = new Residencial_bldg();

        obj2.show_type();
        i = obj2.no_of_floors();
		System.out.println("No of Floors: "+ i);
		
	}

}
