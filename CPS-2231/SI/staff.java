package SI_Bonus_Questions;

public class staff extends employee{
	
	String title;
	
	public staff() {
		
	}
	
	public staff(String name, String address, String email,int number, String office, double salary, int dateHired, String title) {
        super(name, address, email, number, title, salary, dateHired);
        this.title=title; 
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "staff [title=" + title + "]";
	}
}
