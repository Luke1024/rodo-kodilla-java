package com.kodilla.good.patterns.challenges.flights.flightSearchingEngine;

public class DepartureCity {

    private AvailableCities availableCities = new AvailableCities();

    private City cities;

    private Airline airlines;

    public DepartureCity(City cities, Airline airlines) {
        this.cities = cities;
        this.airlines =airlines;
    }

    public City getCities() {
        return cities;
    }

    public Airline getAirlines() {
        return airlines;
    }

    @Override
    public boolean equals(Object o){
        final DepartureCity e = (DepartureCity) o;
        return this.cities.equals(e.cities) && this.airlines.equals(e.airlines);
    }

    public int hashCode(){
        return availableCities.getAvailable().indexOf(cities);
    }

}
