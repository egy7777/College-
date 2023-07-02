package SI_Bonus_Questions;

public class Circle2DTest {

	public static void main(String[] args) {
		
		//object c1
		Circle2D c1 = new Circle2D (2,2,5.5);
		
		//Displaying area and promoter and result 
		System.out.println(c1);
		System.out.println("  Area: " + c1.getArea());
        System.out.println("  Perimeter: " + c1.getPerimeter());
	}
}
