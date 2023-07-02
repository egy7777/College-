package SI_Bonus_Questions;

public class Test {

	public static void main(String[] args) {
		
		int result = 0; 
		result= fn(2,3); 
		System.out.print("The result is: " + result);
	}
	
	// fn(x,1) = x 
	// fn(x,y) = fn(x,y-1) + 2, when y>1
	
	public static int fn (int x, int y) {
		if (x<=1)
			return x; 
		else 
			return fn (x,y-1)+2; 
		
	}

}
