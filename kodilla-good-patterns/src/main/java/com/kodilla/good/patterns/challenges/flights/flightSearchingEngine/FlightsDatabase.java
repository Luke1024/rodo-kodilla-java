package com.kodilla.good.patterns.challenges.flights.flightSearchingEngine;

import java.util.HashMap;
import java.util.Map;

public class FlightsDatabase {
    private Map<DepartureCity, ArrivalCity> database = new HashMap<>();


    public FlightsDatabase() {

        database.put(new DepartureCity(City.WARSAW, Airline.AIRLINE_1), new ArrivalCity(City.WROCLAW));
        database.put(new DepartureCity(City.WARSAW, Airline.AIRLINE_2), new ArrivalCity(City.BIALYSTOK));
        database.put(new DepartureCity(City.WARSAW, Airline.AIRLINE_3), new ArrivalCity(City.KRAKOW));
        database.put(new DepartureCity(City.WARSAW, Airline.AIRLINE_4), new ArrivalCity(City.LODZ));

        database.put(new DepartureCity(City.WROCLAW, Airline.AIRLINE_5), new ArrivalCity(City.KATOWICE));
        database.put(new DepartureCity(City.WROCLAW, Airline.AIRLINE_6), new ArrivalCity(City.POZNAN));
        database.put(new DepartureCity(City.WROCLAW, Airline.AIRLINE_7), new ArrivalCity(City.LODZ));

        database.put(new DepartureCity(City.BIALYSTOK, Airline.AIRLINE_8), new ArrivalCity(City.LUBLIN));
        database.put(new DepartureCity(City.BIALYSTOK, Airline.AIRLINE_9), new ArrivalCity(City.GDANSK));
        database.put(new DepartureCity(City.BIALYSTOK, Airline.AIRLINE_10), new ArrivalCity(City.SZCZECIN));

        database.put(new DepartureCity(City.KATOWICE, Airline.AIRLINE_11), new ArrivalCity(City.POZNAN));

        database.put(new DepartureCity(City.LODZ, Airline.AIRLINE_12), new ArrivalCity(City.POZNAN));
    }
    public Map<DepartureCity, ArrivalCity> getDatabase() {
        return database;
    }
}
