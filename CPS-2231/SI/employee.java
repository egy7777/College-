package SI_Bonus_Questions;

public class employee extends person {

	String office;
	double salary; 
	int dateHired;
	
	public employee() {
		String office;
		double salary; 
		int dateHired;
		
	}
	public employee(String name, String address, String email,int number, String office, double salary, int dateHired) {
        super(name, address, email, number);
		this.office=office;
		this.salary=salary;
		this.dateHired=dateHired; 
	}
	
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDateHired() {
		return dateHired;
	}

	public void setDateHired(int dateHired) {
		this.dateHired = dateHired;
	}
	@Override
	public String toString() {
		return "employee [office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + "]";
	}
	
}
