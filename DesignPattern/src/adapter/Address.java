package adapter;

public class Address {
	
	private String houseNo;
	private String street;
	private String city;
	private Long pin;
	
	
	
	public Address(String houseNo, String street, String city, Long pin) {
		
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPin() {
		return pin;
	}
	public void setPin(Long pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", pin=" + pin + "]";
	}
	
	

}
