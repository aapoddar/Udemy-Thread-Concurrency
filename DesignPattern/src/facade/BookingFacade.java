package facade;

/**
 * This is facade , hides underlying implementation
 * and complexity of subsystems from the client ; i.e here 
 * BookingClient.
 *
 */
public class BookingFacade {
	
	public BookingFacade(){
		FlightBookingInfo.storeFlightInfo();
		HotelBookingInfo.storeFlightInfo();
	}
	
	public Flight flightInformation(String flightNumber){
		return FlightBookingInfo.getFlightDetails(flightNumber);
	}
	
	public Hotel hotelInformation(String hotelName){
		return HotelBookingInfo.getHotelDetails(hotelName);
	}


}
