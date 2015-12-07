
public class Assign2_VoterAge {

	public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);
    
    if ( age >= 18) {
    	
    	System.out.println("Congrates! Your are Eligible to Vote!");
    } else {
    	
    	System.out.println("Sorry! Your are not Eligible to Vote!");
    }
	}

}
