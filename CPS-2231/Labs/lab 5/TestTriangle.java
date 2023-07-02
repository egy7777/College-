package Lab5;

public class TestTriangle {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		Triangle triangle2 = new Triangle(3,4);
		
		System.out.println("Triangle 1 area: " + triangle.getArea()); 
        System.out.println("Triangle 2 area: " + triangle2.getArea()); 
        
        //  setBase and setHeight
        triangle.setBase(7);
        triangle.setHeight(14);
        
        //  getBase getHeight 
        System.out.println("Triangle 1 base: " + triangle.getBase()); 
        System.out.println("Triangle 1 height: " + triangle.getHeight()); 
        
        // toString 
        System.out.println("Triangle 1: " + triangle.toString()); 
        System.out.println("Triangle 2: " + triangle2.toString());	
	}

}
