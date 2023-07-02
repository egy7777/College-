package SI_Bonus_Questions;

public class student extends person {

	String status; 
	
	public student() {
		
	}
	   
	public student(String name, String address, String email, int phone, int studentId, String major, String status) {
	    super(name, address, email, phone);
	    this.status=status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "student [status=" + status + ", name=" + name + ", address=" + address + ", email=" + email + ", status="
				+ status + ", phone=" + phone + ", getMajor()=" + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
