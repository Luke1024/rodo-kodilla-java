package com.kodilla.good.patterns.challenges.flights;


import com.kodilla.good.patterns.challenges.flights.printer.Printer;
import com.kodilla.good.patterns.challenges.flights.searchengine.City;
import com.kodilla.good.patterns.challenges.flights.searchengine.FlightsDatabase;
import com.kodilla.good.patterns.challenges.flights.searchengine.SearchEngine;

public class Flights {

    public static void main(String[] args) {

        FlightsDatabase flightsDatabase = new FlightsDatabase();

        SearchEngine searchEngine = new SearchEngine(flightsDatabase);

        Printer printer = new Printer();

        // 1)
        printer.printFlight(searchEngine.citiesAvailableFromDepartureCity(City.WARSAW));

        // 2)
        printer.printFlight(searchEngine.citiesAvailableToArrivalCity(City.LODZ));

        // 3)
        printer.printFlight(searchEngine.fromTo(City.WARSAW, City.POZNAN));

        // 4) Control case (direct flight)
        printer.printFlight(searchEngine.fromTo(City.WROCLAW, City.POZNAN));

        // 5) Control case (no flight)
        printer.printFlight(searchEngine.fromTo(City.POZNAN, City.KATOWICE));
    }
}
