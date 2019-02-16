package com.kodilla.good.patterns.challenges.flights.searchengine;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SearchEngine {

    public String citiesAvailableFromSpecifiedCity(FlightsDatabase flightsDatabase , City city){
        return "Flights from " + city.toString() + " available to: \n" +
                flightsDatabase.getDatabase().entrySet().stream()
                        .filter(f -> f.getKey().getDeparture().equals(city))
                        .map(f -> f.getKey().getArrival().toString())
                        .collect(Collectors.joining("\n")) + "\n";
    }

    public String citiesWithFlightsToSpecifiedCity(FlightsDatabase flightsDatabase , City city){
        return "Flights to " + city.toString() + " available from: \n"
                + flightsDatabase.getDatabase().entrySet().stream()
                .filter(f -> f.getKey().getArrival().equals(city))
                .map(f -> f.getKey().getDeparture().toString())
                .collect(Collectors.joining("\n")) + "\n";
    }

    public String fromTo(FlightsDatabase flightsDatabase, City cityFrom, City cityTo){

         Map<Flight, FlightData> directFlights =
                 flightsDatabase.getDatabase().entrySet().stream()
                .filter(f -> f.getKey().getDeparture().equals(cityFrom) && f.getKey().getArrival().equals(cityTo))
                 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

         if(directFlights.isEmpty()){

             List<City> citiesBetween = flightsDatabase.getDatabase().entrySet().stream()
                             .filter(f -> f.getKey().getDeparture().equals(cityFrom))
                     .map(f -> f.getKey().getArrival()).collect(Collectors.toList());

             return "Flights from " + cityFrom.toString() + " to " + cityTo.toString()
                     + " are available with change: \n"
                     + flightsDatabase.getDatabase().entrySet().stream()
                     .filter(f -> f.getKey().getArrival().equals(cityTo))
                     .filter(f -> citiesBetween.contains(f.getKey().getDeparture()))
                     .map(f -> cityFrom.toString() + " -> " + f.getKey().getDeparture().toString()
                             + " -> " + f.getKey().getArrival().toString()+"\n").collect(Collectors.joining());
         } else {
             return "Flights from " + cityFrom.toString() + " to " + cityTo.toString() + " are available.\n";
         }
    }
}
