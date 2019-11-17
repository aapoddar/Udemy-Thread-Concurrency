package adapter;

public class UpdatedEmployeeInfo {
	
	private String firstName;
	private String surname;
	private Address address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UpdatedEmployeeInfo [firstName=" + firstName + ", surname=" + surname + ", address=" + address + "]";
	}
	
	
	
}
