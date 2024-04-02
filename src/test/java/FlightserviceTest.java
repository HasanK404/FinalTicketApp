import com.airline.Model.Flight;
import com.airline.service.Flightservice;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightserviceTest {

    @Test
    void testSearchFlights() {
        // Test the searchFlights method
        List<Flight> flights = Flightservice.searchFlights("JFK", "LAX", "2024-04-01", 2, false);

        // Verify the result
        assertEquals(2, flights.size());
        assertEquals("ABC123", flights.get(0).getFlightNumber());
        assertEquals("DEF456", flights.get(1).getFlightNumber());
    }

    @Test
    void testGetWeeklyDirectFlights() {
        // Test the getWeeklyDirectFlights method
        List<Flight> flights = Flightservice.getWeeklyDirectFlights();

        // Verify the result
        assertEquals(2, flights.size());
        assertEquals("ABC123", flights.get(0).getFlightNumber());
        assertEquals("DEF456", flights.get(1).getFlightNumber());
    }
}
