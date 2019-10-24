package lab1;

public class Ticket {

	Passenger passenger;
	Flight flight;
	double price;
	static int number = 0;
	
	public Ticket(Passenger passenger, Flight flight, double price) {
		this.passenger = passenger;
		this.flight = flight;
		this.price = passenger.applyDiscount(price);
		number++;
	}
	
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	public String toString() {
		return(flight + ", ticket price: " + price + "$");
	}
}
