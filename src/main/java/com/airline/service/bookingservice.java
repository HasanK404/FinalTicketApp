package com.airline.service;

import com.airline.Model.Flight;
import com.airline.Model.Booking;

import java.util.List;

public class bookingservice {

    // Method to search for available flights based on user input criteria
    public List<Flight> searchFlights(String departure, String destination, String date, int passengers, boolean isRoundTrip) {
        Flight[] sampleFlights = Flight.getSampleFlights();
        return List.of(sampleFlights);
    }

    // Method to book a flight
    public Booking bookFlight(Flight flight, int passengers) {
        return null;
    }
}
