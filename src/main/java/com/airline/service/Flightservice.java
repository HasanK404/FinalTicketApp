package com.airline.service;

import com.airline.Model.Flight;

import java.util.ArrayList;
import java.util.List;

public class Flightservice {

    // Method to search for available flights based on user input criteria
    public List<Flight> searchFlights(String departure, String destination, String date, int passengers, boolean isRoundTrip) {
        // Get sample flights from the Flight class
        Flight[] sampleFlights = Flight.getSampleFlights();

        // Here, you can filter the sampleFlights based on the provided criteria (departure, destination, date, etc.)
        // For simplicity, we'll return all sample flights as-is for testing purposes
        return List.of(sampleFlights);
    }
    // Method to retrieve a list of available weekly direct flights
    public List<Flight> getWeeklyDirectFlights() {
        // Implement logic to fetch weekly direct flights from a data source
        // For now, returning sample flights for testing purposes
        return List.of(Flight.getSampleFlights());
    }
}