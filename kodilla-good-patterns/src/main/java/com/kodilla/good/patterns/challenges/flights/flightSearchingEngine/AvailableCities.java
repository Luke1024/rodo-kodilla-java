package com.kodilla.good.patterns.challenges.flights.flightSearchingEngine;

import java.util.Arrays;
import java.util.List;

public class AvailableCities {
    private List<City> available = Arrays.asList(City.values());

    public List<City> getAvailable() {
        return available;
    }
}
