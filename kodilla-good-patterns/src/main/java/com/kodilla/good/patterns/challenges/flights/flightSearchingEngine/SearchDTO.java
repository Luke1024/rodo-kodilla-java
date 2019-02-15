package com.kodilla.good.patterns.challenges.flights.flightSearchingEngine;

public class SearchDTO {
    private City departureCity;
    private City placefArrival;

    public SearchDTO(City departureCity, City plaofArrival) {
        this.departureCity = departureCity;
        this.placefArrival = plaofArrival;
    }

    public City getDepartureCity() {
        return departureCity;
    }

    public City getPlaceOffArrival() {
        return placefArrival;
    }
}
