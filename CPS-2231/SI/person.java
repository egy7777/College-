package SI_Bonus_Questions;

public class person {
	public String name, address, email;
	public final String status = "(freshman, sophomore, junior and senior)";
	public int phone;
	
	
	public person() {
		
	}
	public person(String name, String address, String email, int phone) {
		this.name=name;
		this.address= address; 
		this.email=email;
		this.phone=phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + ", email=" + email + ", status=" + status + ", phone="
				+ phone + "]";
	}
}
