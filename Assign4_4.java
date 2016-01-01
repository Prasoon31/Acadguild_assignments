
public class Assign4_4 {
	
	public String Reverse_String(String s) {
		StringBuilder SBd2 = new StringBuilder(s);
		StringBuilder SBd3 = new StringBuilder();
		int len = SBd2.length();
		
		for (int k=0; k < SBd2.length(); k++) {						
			char c1 = SBd2.charAt(len-1); 			
			len--;	
			//System.out.println(c1);
			SBd3.append(c1);			
		}		
		return SBd3.toString();
	}
	
	public static void main(String[] args) {

		StringBuilder SBd = new StringBuilder("I am writing Java code to reverse a string");
		System.out.println("Original String is: "+ SBd.toString());

		//Reverse the String using inbuilt function
		SBd.reverse();
		System.out.println("Reversed String is: "+ SBd.toString());
		
		//Reverse the String without using inbuilt function
		Assign4_4 obj1 = new Assign4_4(); 
		String S2 = obj1.Reverse_String(SBd.toString());
		
		System.out.println("Reversed String is: "+S2);
				
	}

}
