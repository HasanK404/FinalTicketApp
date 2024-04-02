package com.airline.service;

import com.airline.Model.Flight;

import java.util.ArrayList;
import java.util.List;

public class Flightservice {

    // Method to search for available flights based on user input criteria
    public static List<Flight> searchFlights(String departure, String destination, String date, int passengers, boolean isRoundTrip) {
        Flight[] sampleFlights = Flight.getSampleFlights();
        return List.of(sampleFlights);
    }
    // Method to retrieve a list of available weekly direct flights
    public static List<Flight> getWeeklyDirectFlights() {
        return List.of(Flight.getSampleFlights());
    }
}