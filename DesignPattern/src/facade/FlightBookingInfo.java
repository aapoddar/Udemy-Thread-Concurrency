package facade;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightBookingInfo {
	
	public static Map flightMap = new HashMap<>();
	
	public static void storeFlightInfo(){
		Flight f1= new Flight();
		f1.setFilghtNumber("F23389");
		f1.setDepertureTime("23:00");
		f1.setLastDestination("GOA");
		f1.setHaltDestination("Mumbai");
		flightMap.putIfAbsent(f1.getFilghtNumber(), f1);
	}
	
	public static Flight getFlightDetails(String flightNumber){
		return (Flight) flightMap.get(flightNumber);
	}

}
