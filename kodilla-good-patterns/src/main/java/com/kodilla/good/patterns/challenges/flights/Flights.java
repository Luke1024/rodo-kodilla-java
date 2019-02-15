package com.kodilla.good.patterns.challenges.flights;

import com.kodilla.good.patterns.challenges.flights.flightSearchingEngine.City;
import com.kodilla.good.patterns.challenges.flights.flightSearchingEngine.FlightSearch;
import com.kodilla.good.patterns.challenges.flights.flightSearchingEngine.FlightsDatabase;
import com.kodilla.good.patterns.challenges.flights.flightSearchingEngine.SearchDTO;

public class Flights {

    public static void main(String[] args) {

        FlightsDatabase flightsDatabase = new FlightsDatabase();

        FlightSearch flightSearch = new FlightSearch(flightsDatabase);

        // 1)
        System.out.println(
                flightSearch.searchFlight(new SearchDTO(City.WARSAW, City.NONE))
        );

        // 2)
        System.out.println(
                flightSearch.searchFlight(new SearchDTO(City.NONE, City.LODZ))
        );

        // 3)
        System.out.println(
                flightSearch.searchFlight(new SearchDTO(City.WARSAW, City.POZNAN))
        );

        // 4) Control case
        System.out.println(
                flightSearch.searchFlight(new SearchDTO(City.WROCLAW, City.KATOWICE))
        );
    }
}
