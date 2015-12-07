
public class Assign2_PatternPrint {

	public static void main(String[] args) {
		int i=1;
		while (i <= 5){
			int j=1;
			while (j <= i){
			    System.out.print(j);
			    j++;
			}
			System.out.println();
			i++;
		}
		
		int k=4;
		while (k >= 1){
            int l = 1;
			while ( l <= k){
				System.out.print((l));
			    l++;					
			}
			System.out.println();
			k--;
		}		
	}
}
