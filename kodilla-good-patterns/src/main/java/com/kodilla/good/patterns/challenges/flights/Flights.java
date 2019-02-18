package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.searchengine.City;
import com.kodilla.good.patterns.challenges.flights.searchengine.FlightsDatabase;
import com.kodilla.good.patterns.challenges.flights.searchengine.SearchEngine;

public class Flights {

    public static void main(String[] args) {

        FlightsDatabase flightsDatabase = new FlightsDatabase();

        SearchEngine searchEngine = new SearchEngine(flightsDatabase);

        // 1)
        System.out.println(
                        searchEngine.citiesAvailableFromDepartureCity(City.WARSAW));

        // 2)
        System.out.println(
                        searchEngine.citiesAvailableToArrivalCity(City.LODZ));

        // 3)
        System.out.println(
                searchEngine.fromThroughTo(City.WARSAW, City.LODZ, City.POZNAN));

        // 4) Control case
        System.out.println(
                searchEngine.fromThroughTo(City.WROCLAW, City.WARSAW, City.POZNAN));
    }
}
