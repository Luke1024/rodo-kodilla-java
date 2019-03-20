package com.kodilla.good.patterns.challenges.flights.searchengine;

import java.util.List;
import java.util.Map;

public class LastFlightsDTO {
    private Mode mode;
    private List<City> cityList;
    private Map<Flight, FlightData> availableFlights;

    public LastFlightsDTO(Mode mode, List<City> cityList, Map<Flight, FlightData> availableFlights) {
        this.mode = mode;
        this.cityList = cityList;
        this.availableFlights = availableFlights;
    }

    public Mode getMode() {
        return mode;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public Map<Flight, FlightData> getAvailableFlights() {
        return availableFlights;
    }
}
