
/***************************************************************
****************
* Kean University
* Semester Spring 23
* Course: CPS*2231 - Computer Programming
* Author(s): Ben Abraham, Freily Garcia, 
* Lab: 4
* Task # 2
****************************************************************
*********/
package Lab4;

public class TestCircle {
	
	private static final Color WHITE = null;

	public static void main(String[] args) {
		
	
	Circle c1 = new Circle();// we are using no arguments 
	
	System.out.println(c1.toString());
	System.out.println("the radius of c1 = " + + c1.getRadius());

	//set the color
	c1.setColor(Color.GREEN);
	
	//add graphics 
	
	javax.swing.JFrame frame = new javax.swing.JFrame("");
	javax.swing.JOptionPane.showMessageDialog(frame, c1.toString(),
			" c1 information ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	
	//create a circle with  a radius of 5
	Circle c2 = new Circle(5, WHITE);
	
	//circles 3 - 5
	Circle c3 = new Circle(12, WHITE);
	Circle c4 = new Circle(10, WHITE);
	Circle c5 = new Circle(33, WHITE);
	
	//set the color
	c2.setColor(Color.BLUE);
	c3.setColor(Color.RED);
	c4.setColor(Color.YELLOW);
	c5.setColor(Color.BLACK);
	
	//Console for circle 2
	javax.swing.JOptionPane.showMessageDialog(frame, c2.toString(),
			" c2 information ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	
	//Console for circle 3

	javax.swing.JOptionPane.showMessageDialog(frame, c3.toString(),
			" c3 information ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	
	//Console for circle 4

	javax.swing.JOptionPane.showMessageDialog(frame, c4.toString(),
			" c4 information ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	
	//Console for circle 5
	javax.swing.JOptionPane.showMessageDialog(frame, c5.toString(),
			" c5 information ", javax.swing.JOptionPane.INFORMATION_MESSAGE);
	

	}
	
}