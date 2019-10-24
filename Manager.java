package lab1;

import java.util.ArrayList;

public class Manager {

	static ArrayList<Flight> flights = new ArrayList<Flight>();
	static ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	public static void createFlights() {
		Flight flight = new Flight(1, 1, 1, 1.0, "y", "n","6/9/19 4:20 am");
		Flight f2 = new Flight(42, 3, 3, 100, "Toronto", "Tokyo", "22/02/20 8:00 pm");
		flights.add(flight);
		flights.add(f2);
	}

	public static void displayAvailableFlights(String origin, String destination) {
		for(int w = 0; w < flights.size(); w++) {
			if(origin.equals(flights.get(w).getOrigin()) && destination.equals(flights.get(w).getDestination())) {
				if(flights.get(w).getNOSL() > 0) {
					System.out.println(flights.get(w));
				}
			}
		}
	}

	public Flight getFlight(int flightNumber) {
		return flights.get(flightNumber);
	}

	public static void bookSeat(int flightNumber, Passenger p) {
		boolean booked = false;
		for(int e = 0; e < flights.size(); e++) {
			if(flightNumber == flights.get(e).getFlightNumber() && flights.get(e).bookASeat() == true) {
				Ticket ticket = new Ticket(p, flights.get(e), flights.get(e).getOriginalPrice());
				tickets.add(ticket);
				booked = true;
				System.out.println("seat booked");
				break;
			}
		}
		if(booked == false) {
			System.out.println("This flight is unavailable.");
		}
	}

	public static void main(String[]args) {
		createFlights();
		Member p1 = new Member ("Bob", 22, 2);
		NonMember p2 = new NonMember ("Sam", 69);
		Member p3 = new Member("Aamna", 21, 6);
		NonMember p4 = new NonMember("Dylan", 12);
		displayAvailableFlights("Toronto", "Tokyo");
		bookSeat(1, p1);
		bookSeat(1, p2);
		bookSeat(42, p3);
		bookSeat(42, p2);
		bookSeat(42, p4);
		for(int r = 0; r < tickets.size(); r++) {
			System.out.println(tickets.get(r));
		}
	}
}
