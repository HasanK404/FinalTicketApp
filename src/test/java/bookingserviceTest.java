import com.airline.Model.Flight;
import com.airline.Model.Booking;
import com.airline.service.bookingservice;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class bookingserviceTest {

    @Test
    void testSearchFlights() {
        // Mocking the Flight class
        Flight[] sampleFlights = new Flight[2];
        sampleFlights[0] = new Flight("ABC123", "JFK", "LAX", null, null, 150, "Boeing 737");
        sampleFlights[1] = new Flight("DEF456", "LAX", "ORD", null, null, 200, "Airbus A320");
        bookingservice bookingService = new bookingservice();

        // Test the searchFlights method
        List<Flight> flights = bookingService.searchFlights("JFK", "LAX", "2024-04-01", 2, false);

        // Verify the result
        assertEquals(2, flights.size());
        assertEquals("ABC123", flights.get(0).getFlightNumber());
        assertEquals("DEF456", flights.get(1).getFlightNumber());
    }

    @Test
    void testBookFlight() {
        // Mocking the Flight class
        Flight flight = new Flight("ABC123", "JFK", "LAX", null, null, 150, "Boeing 737");
        bookingservice bookingService = new bookingservice();

        // Test the bookFlight method
        Booking booking = bookingService.bookFlight(flight, 2);

        // Verify the result
        assertEquals(null, booking); // As the method is not implemented, it should return null
    }
}
