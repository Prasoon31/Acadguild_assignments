
public class Assign2_PrimeNos {
	public static void main(String[] args) {		
		int no = Integer.parseInt(args[0]);
		int i = 2;		
	    while ( i <= no ) {
	    	int y ;	        
	    	int x = 2;
	    	if ( i == 3) {
	    		y = 2;
	    	} else {
	    		y = i/2;
	    	// int y = i-1;
	    	}
	    	while ( x <= y) {
	    		int mod_op = i%x; 
	    		if ( mod_op > 0 ) {
	    			if (x == y) {
	    				System.out.println( i );
	    			}
	    			x++;
	    		} else {
	    			break;
	    		} 
	    	} 	
	    	i++;
	    }

	}

}
