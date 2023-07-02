package SI_Sessions;

public class Rectangle {
private int length, width; 
public String name; 
		
		public Rectangle(){
			this.length = 0; 
			this.width = 0; 
			this.name = "Rectangle"; 
		}
		
		public Rectangle(int length, int width, String name) {
			this.name = name; 
			this.length = length; 
			this.width = width; 
		}
		
		public int getLength() {
			return length; 
		}
		public void setLength(int length) {
			this.length = length; 
		}
		
		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int area() {
			
			return length * width; 
		}
	
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int perimiter() {
			return (length + width) * 2; 
		}
		
		public boolean euqals(Rectangle c) {
			if (this.length == c.length && this.width == c.width ) {
				
				return true;
			}
			return false;
		}
		
		@Override
		public String toString() {
			return "Rectangle [length=" + length + ", width=" + width + ", name=" + name + "]";
		}
		
	}


