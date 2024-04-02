import com.airline.Model.Flight;
import com.airline.controller.FlightController;
import com.airline.service.Flightservice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class mainClass {

    @Mock
    private Flightservice flightService;

    @InjectMocks
    private mainClass mainClass;

    @Mock
    private Model model;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShowWeeklyDirectFlights() {
        // Set up test data and expectations
        List<Flight> expectedFlights = new ArrayList<>();
        Flight flight1 = new Flight("ABC123", "JFK", "LAX", null, null, 150, "Boeing 737");
        expectedFlights.add(flight1);

        // Stubbing the method call on the flightService mock
        when(Flightservice.getWeeklyDirectFlights()).thenReturn(expectedFlights);

        // Call the method under test
        String viewName = FlightController.showWeeklyDirectFlights(model);

        // Assert the results
        assertEquals("weekly_direct_flights", viewName);
        verify(model).addAttribute("flights", expectedFlights);
    }

    @Test
    public void testSearchFlights() {
        String departure = "JFK";
        String destination = "LAX";
        String dates = "2024-04-10";
        int passengers = 1;
        boolean isRoundTrip = false;

        List<Flight> expectedFlights = new ArrayList<>();
        Flight flight1 = new Flight("ABC123", "JFK", "LAX", null, null, 150, "Boeing 737");
        expectedFlights.add(flight1);

        when(Flightservice.searchFlights(departure, destination, dates, passengers, isRoundTrip)).thenReturn(expectedFlights);

        String viewName = FlightController.searchFlights(departure, destination, dates, passengers, isRoundTrip, model);

        assertEquals("flight_results", viewName);
        verify(model).addAttribute("flights", expectedFlights);
    }

    // Add more test cases for other controller methods as needed
}
