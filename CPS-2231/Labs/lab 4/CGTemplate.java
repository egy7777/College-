/***************************************************************
****************
* Kean University
* Semester Spring 23
* Course: CPS*2231 - Computer Programming
* Author(s):Ben Abraham, Freily Garcia, 
* Lab: 4
* Task # 3
****************************************************************
*********/
package Lab4;

import java.awt.*;       // Using AWT's Graphics and Color
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing's components and containers

public class CGTemplate extends JFrame {

	public static final int CANVAS_WIDTH  = 640;
	public static final int CANVAS_HEIGHT = 480;
	private DrawCanvas canvas;

	// Constructor to set up the GUI components and event handlers
	public CGTemplate() {
		canvas = new DrawCanvas();    // Construct the drawing canvas
		canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

		// Set the Drawing JPanel as the JFrame's content-pane
		setContentPane(canvas);  
		setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
		pack();              // Either pack() the components; or setSize()
		setTitle("Lab4 - Let's make a Circle");  // "super" JFrame sets the title
		setVisible(true);    // "super" JFrame show
	}

	private class DrawCanvas extends JPanel {
		// Override paintComponent to perform your own painting
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);     // paint parent's background
			setBackground(java.awt.Color.BLUE);  // you can update this    
			g.setColor(java.awt.Color.WHITE);    // set the drawing color
			//drawing a circle
			g.drawOval(100, 100, 100, 100); // first two numbers are X&Y coordinates, 100 & 100 are width and height 
			g.fillOval(100, 100, 100, 100);

			g.setColor(java.awt.Color.YELLOW);    // set the drawing color
			g.drawOval(530, 30, 50, 50);
			g.fillOval(530, 30, 50, 50);

			g.setColor(java.awt.Color.RED);    // set the drawing color
			g.drawOval(100, 300, 150, 150);
			g.fillOval(100, 300, 150, 150);

			g.setColor(java.awt.Color.BLACK);    // set the drawing color
			g.drawOval(250, 200, 90, 90);
			g.fillOval(250, 200, 90, 90);

			g.setColor(java.awt.Color.GREEN);    // set the drawing color
			g.drawOval(390, 200, 250, 250);
			g.fillOval(390, 200, 250, 250);

			g.setFont(new Font("Monospaced", Font.PLAIN, 12));
			g.drawString("Circles c1, c2, c3, c4 and c5", 10, 20);
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CGTemplate();
			}
		});
	}
}