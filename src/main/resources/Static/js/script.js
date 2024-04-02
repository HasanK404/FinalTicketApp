// script.js

// Function to handle the search form submission
function searchFlights() {
    // Retrieve form data
    var departure = document.getElementById("departure").value;
    var destination = document.getElementById("destination").value;
    var dates = document.getElementById("dates").value;
    var passengers = document.getElementById("passengers").value;
    var isRoundTrip = document.getElementById("isRoundTrip").checked;

    // Make AJAX request to search for flights
    $.ajax({
        url: "/template/flight_search_form.html",
        type: "POST",
        data: {
            departure: departure,
            destination: destination,
            dates: dates,
            passengers: passengers,
            isRoundTrip: isRoundTrip
        },
        success: function (response) {
            // Handle success response
            console.log(response);
            // Redirect to flight results page
            window.location.href = "/template/flight_results";
        },
        error: function (xhr, status, error) {
            // Handle error response
            console.error(error);
            // Redirect to error page
            window.location.href = "/template/error.html";
        }
    });
}