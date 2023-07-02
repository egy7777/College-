package SI_Bonus_Questions;

public class faculty extends employee {
	String rank, officeHours; 
	
	
	public faculty(){
		
	}
	
	public faculty(String rank, String officeHours, String office, double salary, int dateHired) {
		
		//wrong
		super (office, office, office, dateHired, office, salary, dateHired);
		this.rank=rank;
		this.officeHours=officeHours; 
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	@Override
	public String toString() {
		return "faculty [rank=" + rank + ", officeHours=" + officeHours + "]";
	}	
	
}
