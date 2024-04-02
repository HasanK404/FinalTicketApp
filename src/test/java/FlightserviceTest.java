import com.airline.Model.Flight;
import com.airline.service.Flightservice;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FlightserviceTest {

    @Test
    void testSearchFlights() {
        // Mocking the Flight class
        Flight[] sampleFlights = new Flight[2];
        sampleFlights[0] = new Flight("ABC123", "JFK", "LAX", null, null, 150, "Boeing 737");
        sampleFlights[1] = new Flight("DEF456", "LAX", "ORD", null, null, 200, "Airbus A320");

        // Mocking the static method Flight.getSampleFlights()
        Flight[] mockedFlights = new Flight[]{mock(Flight.class), mock(Flight.class)};
        when(mockedFlights[0].getSampleFlights()).thenReturn(sampleFlights);

        // Test the searchFlights method
        List<Flight> flights = Flightservice.searchFlights("JFK", "LAX", "2024-04-01", 2, false);

        // Verify the result
        assertEquals(2, flights.size());
        assertEquals("ABC123", flights.get(0).getFlightNumber());
        assertEquals("DEF456", flights.get(1).getFlightNumber());
    }

    @Test
    void testGetWeeklyDirectFlights() {
        // Mocking the Flight class
        Flight[] sampleFlights = new Flight[2];
        sampleFlights[0] = new Flight("ABC123", "JFK", "LAX", null, null, 150, "Boeing 737");
        sampleFlights[1] = new Flight("DEF456", "LAX", "ORD", null, null, 200, "Airbus A320");

        // Mocking the static method Flight.getSampleFlights()
        Flight[] mockedFlights = new Flight[]{mock(Flight.class), mock(Flight.class)};
        when(mockedFlights[1].getSampleFlights()).thenReturn(sampleFlights);

        // Test the getWeeklyDirectFlights method
        List<Flight> flights = Flightservice.getWeeklyDirectFlights();

        // Verify the result
        assertEquals(2, flights.size());
        assertEquals("ABC123", flights.get(0).getFlightNumber());
        assertEquals("DEF456", flights.get(1).getFlightNumber());
    }
}
