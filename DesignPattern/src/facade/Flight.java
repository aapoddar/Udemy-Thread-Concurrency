package facade;

public class Flight {
	
	private String filghtNumber;
	private String depertureTime;
	private String lastDestination;
	private String haltDestination;
	public String getFilghtNumber() {
		return filghtNumber;
	}
	public void setFilghtNumber(String filghtNumber) {
		this.filghtNumber = filghtNumber;
	}
	public String getDepertureTime() {
		return depertureTime;
	}
	public void setDepertureTime(String depertureTime) {
		this.depertureTime = depertureTime;
	}
	public String getLastDestination() {
		return lastDestination;
	}
	public void setLastDestination(String lastDestination) {
		this.lastDestination = lastDestination;
	}
	public String getHaltDestination() {
		return haltDestination;
	}
	public void setHaltDestination(String haltDestination) {
		this.haltDestination = haltDestination;
	}
	@Override
	public String toString() {
		return "Flight [filghtNumber=" + filghtNumber + ", depertureTime=" + depertureTime + ", lastDestination="
				+ lastDestination + ", haltDestination=" + haltDestination + "]";
	}
	
	

}
