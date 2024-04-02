package com.airline.controller;

import com.airline.Model.Booking;
import com.airline.Model.Flight;
import com.airline.service.Flightservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication; // Import the necessary annotation
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication // Add @SpringBootApplication annotation
@Controller
@RequestMapping("/flight")
public class mainClass {

    private final Flightservice flightService;

    @Autowired
    public mainClass(Flightservice flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/weekly-direct-flights")
    public String showWeeklyDirectFlights(Model model) {
        List<Flight> weeklyDirectFlights = flightService.getWeeklyDirectFlights();
        model.addAttribute("flights", weeklyDirectFlights);
        return "weekly_direct_flights"; // Assuming weekly_direct_flights is the name of the Thymeleaf template
    }

    @GetMapping("/search")
    public String showSearchForm() {
        return "flight_search_form";
    }

    @PostMapping("/search")
    public String searchFlights(@RequestParam("departure") String departure,
                                @RequestParam("destination") String destination,
                                @RequestParam("dates") String dates,
                                @RequestParam("passengers") int passengers,
                                @RequestParam("isRoundTrip") boolean isRoundTrip,
                                Model model) {
        List<Flight> flights = flightService.searchFlights(departure, destination, dates, passengers, isRoundTrip);
        model.addAttribute("flights", flights);
        return "flight_results";
    }

    @GetMapping("/bookingConfirmation")
    public String displayBookingConfirmation(Model model, Booking bookingDetails) {
        model.addAttribute("booking", bookingDetails);
        return "bookingConfirmation"; // Assuming bookingConfirmation is the name of the Thymeleaf template
    }

    @GetMapping("/error")
    public String showErrorPage() {
        return "error"; // Assuming error is the name of the Thymeleaf error page template
    }

}
