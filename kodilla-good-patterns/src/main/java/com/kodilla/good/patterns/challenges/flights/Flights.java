package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.searchengine.City;
import com.kodilla.good.patterns.challenges.flights.searchengine.FlightsDatabase;
import com.kodilla.good.patterns.challenges.flights.searchengine.SearchEngine;

public class Flights {

    public static void main(String[] args) {
        FlightsDatabase flightsDatabase = new FlightsDatabase();

        SearchEngine searchEngine = new SearchEngine();

        // 1)
        System.out.println(
                searchEngine.citiesAvailableFromSpecifiedCity(flightsDatabase, City.WARSAW));

        // 2)
        System.out.println(
                searchEngine.citiesWithFlightsToSpecifiedCity(flightsDatabase, City.LODZ));

        // 3)
        System.out.println(
                searchEngine.fromTo(flightsDatabase, City.WARSAW, City.POZNAN));

        // 4) Control case
        System.out.println(
                searchEngine.fromTo(flightsDatabase, City.WROCLAW, City.KATOWICE));
    }
}
