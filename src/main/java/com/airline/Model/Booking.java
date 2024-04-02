package com.airline.Model;

import java.util.Date;

public class Booking {
    private String bookingId;
    private String userId;
    private String flightId;
    private Date bookingDate;
    private String seatNumber;
    private String mealOption;
    private String paymentMethod;

    // Constructors
    public Booking() {
    }

    public Booking(String bookingId, String userId, String flightId, Date bookingDate, String seatNumber, String mealOption, String paymentMethod) {
        this.bookingId = bookingId;
        this.userId = userId;
        this.flightId = flightId;
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.mealOption = mealOption;
        this.paymentMethod = paymentMethod;
    }

    // Getters and setters
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getMealOption() {
        return mealOption;
    }

    public void setMealOption(String mealOption) {
        this.mealOption = mealOption;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

}
