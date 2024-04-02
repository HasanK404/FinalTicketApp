import com.airline.Model.Booking;
        import com.airline.Model.Flight;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import java.util.Date;
        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.mockito.Mockito.mock;
        import static org.mockito.Mockito.when;

public class ModelTest {

    private Booking booking;
    private Flight flight;

    @BeforeEach
    void setUp() {
        // Create a mock for Booking and Flight objects
        booking = mock(Booking.class);
        flight = mock(Flight.class);
    }

    @Test
    void testBookingDetails() {
        // Define the expected booking details
        String bookingId = "B001";
        String userId = "U001";
        String flightId = "F001";
        Date bookingDate = new Date();
        String seatNumber = "A123";
        String mealOption = "Vegetarian";
        String paymentMethod = "Credit Card";

        // Set up mock behavior
        when(booking.getBookingId()).thenReturn(bookingId);
        when(booking.getUserId()).thenReturn(userId);
        when(booking.getFlightId()).thenReturn(flightId);
        when(booking.getBookingDate()).thenReturn(bookingDate);
        when(booking.getSeatNumber()).thenReturn(seatNumber);
        when(booking.getMealOption()).thenReturn(mealOption);
        when(booking.getPaymentMethod()).thenReturn(paymentMethod);

        // Verify the booking details
        assertEquals(bookingId, booking.getBookingId());
        assertEquals(userId, booking.getUserId());
        assertEquals(flightId, booking.getFlightId());
        assertEquals(bookingDate, booking.getBookingDate());
        assertEquals(seatNumber, booking.getSeatNumber());
        assertEquals(mealOption, booking.getMealOption());
        assertEquals(paymentMethod, booking.getPaymentMethod());
    }

    @Test
    void testFlightDetails() {
        // Define the expected flight details
        String flightNumber = "F001";
        String departureAirport = "JFK";
        String destinationAirport = "LAX";
        Date departureTime = new Date();
        Date arrivalTime = new Date();
        int availableSeats = 150;
        String aircraftType = "Boeing 737";

        // Set up mock behavior
        when(flight.getFlightNumber()).thenReturn(flightNumber);
        when(flight.getDepartureAirport()).thenReturn(departureAirport);
        when(flight.getDestinationAirport()).thenReturn(destinationAirport);
        when(flight.getDepartureTime()).thenReturn(departureTime);
        when(flight.getArrivalTime()).thenReturn(arrivalTime);
        when(flight.getAvailableSeats()).thenReturn(availableSeats);
        when(flight.getAircraftType()).thenReturn(aircraftType);

        // Verify the flight details
        assertEquals(flightNumber, flight.getFlightNumber());
        assertEquals(departureAirport, flight.getDepartureAirport());
        assertEquals(destinationAirport, flight.getDestinationAirport());
        assertEquals(departureTime, flight.getDepartureTime());
        assertEquals(arrivalTime, flight.getArrivalTime());
        assertEquals(availableSeats, flight.getAvailableSeats());
        assertEquals(aircraftType, flight.getAircraftType());
    }
}

