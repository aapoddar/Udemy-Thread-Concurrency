package facade;

import java.util.HashMap;
import java.util.Map;

public class HotelBookingInfo {
	
public static Map hotelMap = new HashMap<>();
	
	public static void storeFlightInfo(){
		Hotel h1= new Hotel();
		h1.setHotelName("Hotel Ashoka");
		h1.setCity("Panaji");
		h1.setPin("890890");
		h1.setState("Goa");
		h1.setStreetName("Salgokar street");
		hotelMap.putIfAbsent(h1.getHotelName(), h1);
	}
	
	public static Hotel getHotelDetails(String hotelName){
		return (Hotel) hotelMap.get(hotelName);
	}

}
