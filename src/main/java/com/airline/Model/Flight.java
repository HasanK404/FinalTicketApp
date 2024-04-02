package com.airline.Model;

import java.util.Date;

public class Flight {
    private String flightNumber;
    private String departureAirport;
    private String destinationAirport;
    private Date departureTime;
    private Date arrivalTime;
    private int availableSeats;
    private String aircraftType;

    // Constructors
    public Flight() {
    }

    public Flight(String flightNumber, String departureAirport, String destinationAirport, Date departureTime, Date arrivalTime, int availableSeats, String aircraftType) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
        this.aircraftType = aircraftType;
    }

    // Getters and setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }
    public static Flight[] getSampleFlights() {
        Flight[] sampleFlights = new Flight[2]; // Sample data for two flights

        // First flight
        sampleFlights[0] = new Flight("ABC123", "JFK", "LAX", new Date(), new Date(), 150, "Boeing 737");

        // Second flight
        sampleFlights[1] = new Flight("DEF456", "LAX", "ORD", new Date(), new Date(), 200, "Airbus A320");

        return sampleFlights;
    }
}
