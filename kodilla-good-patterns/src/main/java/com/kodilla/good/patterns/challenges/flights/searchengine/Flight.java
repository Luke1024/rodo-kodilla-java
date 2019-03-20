package com.kodilla.good.patterns.challenges.flights.searchengine;

import java.util.Objects;

public class Flight {
    private City departure;
    private City arrival;

    public Flight(City departure, City arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public City getDeparture() {
        return departure;
    }

    public City getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        final Flight e = (Flight) o;
        return this.departure.equals(e.departure) && this.arrival.equals(e.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeparture());
    }
}
