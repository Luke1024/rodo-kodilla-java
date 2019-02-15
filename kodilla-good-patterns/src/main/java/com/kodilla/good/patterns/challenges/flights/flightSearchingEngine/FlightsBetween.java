package com.kodilla.good.patterns.challenges.flights.flightSearchingEngine;

import java.util.Map;

public interface FlightsBetween {
    Map<DepartureCity, ArrivalCity> getflightsBetween(City city);
}
