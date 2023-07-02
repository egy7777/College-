package SI_Sessions;

public class Test {

	public static void main(String[] args) {
		Food f1 = new Food(" food 1 " , 1.1);
		System.out.println(f1.eat());
		
		Pizza p1 = new Pizza();	
		System.out.println(p1.eat());
		
		Pizza p2 = new Pizza("sauce" , 5, 200.50);
		System.out.println(p2.eat());
	
	}

}
