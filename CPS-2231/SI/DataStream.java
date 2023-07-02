package SI_Bonus_Questions;
import java.io.*; 
public class DataStream {

	public static void main(String[] args) {
		
		try {
			DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
			output.writeUTF("Book1");
			output.writeInt(85);
			output.writeUTF("Book2");
			output.writeInt(125);
			output.writeUTF("Book3");
			output.writeInt(70);
			output.close();
			
			DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));
			while (input.available() > 0) {
				String bookName = input.readUTF();
				int bookPages = input.readInt();
				System.out.println("Book Name: " + bookName + ", Pages: " + bookPages);
			}
			input.close();
		} catch (IOException e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
		
		
		
		/*DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));
			output.writeUTF("Book1");
			output.writeUTF(85);
			output.writeUTF("BOok2");
			output.writeUTF(125);
			output.writeUTF("Book3");
			output.writeUTF(70);
			output.close();
			
			//ToDo: read all data from temp.dat and print the data to the standard output (monitor)
		*/
		
	}

}
