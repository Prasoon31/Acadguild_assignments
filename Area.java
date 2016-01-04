package Session5_2;

public class Area {
	
	private int Area_square;
	private int Area_rec;
	
	Area (int s){
		
		Area_square = s*s;
	}
	
	Area (int L, int B){
		
		Area_rec = L*B;
	}
	
	int get_square_area(){
		return Area_square;
	}
	
	int get_rect_area(){
		return Area_rec;
	}
	
	public static void main(String[] args) {
		
		Area obj1 = new Area(25);
		
		Area obj2 = new Area(2, 45);
		
		System.out.println("Area of Square is: "+ obj1.get_square_area());
		System.out.println("Area of Rectangle is: "+ obj2.get_rect_area());
		
	}

}
