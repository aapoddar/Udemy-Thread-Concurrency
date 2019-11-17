package facade;

public class BookingClient {

	public static void main(String[] args) {
	
		BookingFacade facade = new BookingFacade();
		System.out.println("Flight Info :"+facade.flightInformation("F23389").toString());
		System.out.println("Hotel Info :"+facade.hotelInformation("Hotel Ashoka").toString());

	}

}
