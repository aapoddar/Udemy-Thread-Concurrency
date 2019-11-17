package adapter;

public class AddressAdpter {
	
	public static Address toAddress(String houseNo,
	 String street,
	 String city,
	 Long pin){
		
		return new Address(houseNo,street,city,pin);
		
	}
	

}
