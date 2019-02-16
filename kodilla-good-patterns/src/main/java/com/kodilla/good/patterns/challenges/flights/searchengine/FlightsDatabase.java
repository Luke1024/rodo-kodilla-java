package com.kodilla.good.patterns.challenges.flights.searchengine;

import java.util.HashMap;
import java.util.Map;

public class FlightsDatabase {
    private final Map<Flight, FlightData> database = new HashMap();

    public FlightsDatabase() {

                database.put(new Flight(City.WARSAW, City.WROCLAW), new FlightData());
                database.put(new Flight(City.WARSAW, City.BIALYSTOK), new FlightData());
                database.put(new Flight(City.WARSAW, City.KRAKOW), new FlightData());
                database.put(new Flight(City.WARSAW, City.LODZ), new FlightData());

                database.put(new Flight(City.WROCLAW, City.KATOWICE), new FlightData());
                database.put(new Flight(City.WROCLAW, City.POZNAN), new FlightData());
                database.put(new Flight(City.WROCLAW, City.LODZ), new FlightData());

                database.put(new Flight(City.BIALYSTOK, City.LUBLIN), new FlightData());
                database.put(new Flight(City.BIALYSTOK, City.GDANSK), new FlightData());
                database.put(new Flight(City.BIALYSTOK, City.SZCZECIN), new FlightData());

                database.put(new Flight(City.KATOWICE, City.POZNAN), new FlightData());

                database.put(new Flight(City.LODZ, City.POZNAN), new FlightData());

                database.put(new Flight(City.LODZ, City.POZNAN), new FlightData());
    }

    public Map<Flight, FlightData> getDatabase() {
        return database;
    }
}
