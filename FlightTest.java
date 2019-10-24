package lab1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlightTest {

	@Test
	public void testConstructor() {
		Flight tC = new Flight(1, 1, 1, 2, "rty", "wer", "yui");
		assertEquals("flight number method confirmed", 1,tC.getFlightNumber());
		assertEquals("capacity method confirmed", 1,tC.getCapacity());
		assertEquals("NOSL method confirmed", 1,tC.getNOSL());
		assertEquals("price method confirmed", 2,tC.getOriginalPrice(), 0.1);
		assertEquals("origin method confirmed", "rty",tC.getOrigin());
		assertEquals("destination method confirmed", "wer",tC.getDestination());
		assertEquals("departure time method confirmed", "yui",tC.getDepartureTime());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testInvalidConstructor() {
		Flight tIC = new Flight(1, 1, 1, 2, "rty", "rty", "yui");
	}
}
