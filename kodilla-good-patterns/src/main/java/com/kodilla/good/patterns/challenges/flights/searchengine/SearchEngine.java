package com.kodilla.good.patterns.challenges.flights.searchengine;

import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine {

    private FlightsDatabase flightsDatabase;

    public SearchEngine(FlightsDatabase flightsDatabase) {
        this.flightsDatabase = flightsDatabase;
    }

    public String citiesAvailableFromDepartureCity(City city){
        return "Flights from " + city.toString() + " available to: \n" +
                flightsDatabase.getDatabase().entrySet().stream()
                        .filter(f -> f.getKey().getDeparture().equals(city))
                        .map(f -> f.getKey().getArrival().toString())
                        .collect(Collectors.joining("\n")) + "\n";
    }

    public String citiesAvailableToArrivalCity(City city){
        return "Flights to " + city.toString() + " available from: \n" +
                flightsDatabase.getDatabase().entrySet().stream()
                        .filter(f -> f.getKey().getArrival().equals(city))
                        .map(f -> f.getKey().getDeparture().toString())
                        .collect(Collectors.joining("\n")) + "\n";
    }

    public String fromThroughTo(City cityFrom, City cityThrough, City cityTo) {

        List<City> availableCitiesThrough =
                flightsDatabase.getDatabase().entrySet().stream()
                        .filter(f -> (f.getKey().getDeparture().equals(cityThrough) || f.getKey().getArrival().equals(cityThrough)))
                        .filter(f -> f.getKey().getDeparture().equals(cityFrom) || f.getKey().getDeparture().equals(cityTo))
                        .map(c -> c.getKey().getDeparture()).collect(Collectors.toList());

        if(availableCitiesThrough.isEmpty()){

            return "Flights from " + cityFrom.toString() + " to " + cityTo.toString()
                    + " through " + cityThrough.toString() + " are not available." + "\n";

        } else {

            return "Flights from " + cityFrom.toString() + " to " + cityTo.toString()
                    + " through " + cityThrough.toString() + " are available. " + "\n";
        }
    }
}
