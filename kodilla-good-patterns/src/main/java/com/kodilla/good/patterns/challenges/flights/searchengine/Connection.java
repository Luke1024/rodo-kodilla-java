package com.kodilla.good.patterns.challenges.flights.searchengine;

import java.util.LinkedHashMap;

public class Connection {
    private LinkedHashMap<Flight, FlightData> connection;

    public Connection(LinkedHashMap<Flight, FlightData> connection) {
        this.connection = connection;
    }

    public LinkedHashMap<Flight, FlightData> getConnection() {
        return connection;
    }
}
