package com.airline.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConverter {

    private static final String TWELVE_HOUR_FORMAT = "hh:mm a";
    private static final String TWENTY_FOUR_HOUR_FORMAT = "HH:mm";

    // Method to convert time from 12-hour format to 24-hour format
    public static String convertTo24HourFormat(String twelveHourTime) {
        try {
            SimpleDateFormat twelveHourFormat = new SimpleDateFormat(TWELVE_HOUR_FORMAT);
            SimpleDateFormat twentyFourHourFormat = new SimpleDateFormat(TWENTY_FOUR_HOUR_FORMAT);
            Date date = twelveHourFormat.parse(twelveHourTime);
            return twentyFourHourFormat.format(date);
        } catch (ParseException e) {
            System.err.println("Error parsing time: " + e.getMessage());
            return null;
        }
    }

    // Method to convert time from 24-hour format to 12-hour format
    public static String convertTo12HourFormat(String twentyFourHourTime) {
        try {
            SimpleDateFormat twelveHourFormat = new SimpleDateFormat(TWELVE_HOUR_FORMAT);
            SimpleDateFormat twentyFourHourFormat = new SimpleDateFormat(TWENTY_FOUR_HOUR_FORMAT);
            Date date = twentyFourHourFormat.parse(twentyFourHourTime);
            return twelveHourFormat.format(date);
        } catch (ParseException e) {
            System.err.println("Error parsing time: " + e.getMessage());
            return null;
        }
    }
}
