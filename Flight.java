package lab1;

public class Flight {

	private int flightNumber;
	private String origin;
	private String destination;
	private String departureTime;
	private int capacity;
	private int numberOfSeatsLeft;
	private double originalPrice;
	
	public Flight(int fNum, int cap, int nOSL, double oPrice, String origin, String dest, String dTime) {
		if(origin.compareToIgnoreCase(dest) == 0) {
				throw new IllegalArgumentException("you can't fly to the same spot");
		}
		else {
			this.flightNumber = fNum;
			this.origin = origin;
			this.destination = dest;
			this.departureTime = dTime;
			this.capacity = cap;
			this.numberOfSeatsLeft = nOSL;
			this.originalPrice = oPrice;
		}
	}
	
	public String toString() {
		return ("Flight " + flightNumber + ", " + origin + " to " + destination + ", " + departureTime + ", original price: " + originalPrice + "$");
	}
	
	public void setFlightNumber(int fNum) {
		this.flightNumber = fNum;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setOrigin(String og) {
		this.origin = og;
	}
	public String getOrigin() {
		return origin;
	}
	public void setDestination(String des) {
		this.destination = des;
	}
	public String getDestination() {
		return destination;
	}
	public void setDespartureTime(String dep) {
		this.departureTime = dep;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setCapacity(int cap) {
		this.capacity = cap;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setNOSL(int nOSL) {
		this.numberOfSeatsLeft = nOSL;
	}
	public int getNOSL() {
		return numberOfSeatsLeft;
	}
	public void setOriginalPrice(double op) {
		this.originalPrice = op;
	}
	public double getOriginalPrice() {
		return originalPrice;
	}
	
	public boolean bookASeat() {
		if(numberOfSeatsLeft > 0) {
			numberOfSeatsLeft--;
			return true;
		}
		return false;
	}
}
