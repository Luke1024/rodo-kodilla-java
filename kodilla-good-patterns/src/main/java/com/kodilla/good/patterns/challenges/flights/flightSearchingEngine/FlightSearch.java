package com.kodilla.good.patterns.challenges.flights.flightSearchingEngine;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearch {
    private Map<DepartureCity, ArrivalCity> database;

    private FlightsBetween flightsBetween =
            (City city) -> database.entrySet().stream()
            .filter(e -> e.getKey().getCities().equals(city))
                    .collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));

    private String comment="";

    public FlightSearch(FlightsDatabase flightsDatabase) {
        this.database = flightsDatabase.getDatabase();
    }

    public String searchFlight(SearchDTO searchDTO) {
        City departure = searchDTO.getDepartureCity();
        City arrival = searchDTO.getPlaceOffArrival();

        if (departure != City.NONE && arrival == City.NONE) {
            comment = fromDepartureCity(database,searchDTO);
        }

        if (departure == City.NONE && arrival != City.NONE) {
            comment = toArrivalCity(database, searchDTO);
        }

        if(departure != City.NONE && arrival != City.NONE) {
            comment = fromDepartureToArrival(database, searchDTO);
        }

        if(departure == City.NONE && arrival == City.NONE) {
            comment = "Empty request.";
        }
        return comment;
    }

    private String fromDepartureCity(Map<DepartureCity, ArrivalCity> database, SearchDTO searchDTO) {
        List<City> citiesAvailableFromDepartureCity = database.entrySet().stream().map(Map.Entry::getKey)
                .filter(key -> key.getCities().equals(City.WARSAW))
                .map(key -> database.get(key).getCities()).collect(Collectors.toList());

        if (!citiesAvailableFromDepartureCity.isEmpty()) {
            comment = "Flights from " + searchDTO.getDepartureCity().toString()
                    + " available to " + citiesAvailableFromDepartureCity.toString();
        } else {
            comment = "Flights from " + searchDTO.getDepartureCity().toString() + " not available.";
        }
        comment += "\n";
        return comment;
    }

    private String toArrivalCity(Map<DepartureCity, ArrivalCity> database, SearchDTO searchDTO) {

        List<City> flighsAvailableToArrivalCity = database.entrySet().stream()
                .filter(entry -> entry.getValue().getCities().equals(City.LODZ))
                .map(entry -> entry.getKey().getCities()).collect(Collectors.toList());

        if (!flighsAvailableToArrivalCity.isEmpty()) {
            comment = "Flights to " + searchDTO.getPlaceOffArrival().toString()
                    + " available from " + flighsAvailableToArrivalCity.toString();
        } else {
            comment = "Flights to " + searchDTO.getPlaceOffArrival().toString() + " not available.";
        }
        comment += "\n";

        return comment;
    }

    private String fromDepartureToArrival(Map<DepartureCity, ArrivalCity> database, SearchDTO searchDTO) {
        City departure = searchDTO.getDepartureCity();
        City arrival = searchDTO.getPlaceOffArrival();

        Map<DepartureCity, ArrivalCity> directFlight = database.entrySet().stream()
                .filter(flight -> flight.getKey().getCities().equals(departure) && flight.getValue().getCities().equals(arrival))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        if (directFlight.isEmpty()) {

            return "Flights from " + departure + " to " + arrival + " available with change: \n" +
                    database.entrySet().stream()
                            .filter(e -> e.getKey().getCities().equals(departure))
                            .map(e -> e.getValue().getCities())
                            .map(en -> flightsBetween.getflightsBetween(en))
                            .flatMap(e -> e.entrySet().stream())
                            .filter(e -> e.getValue().getCities().equals(arrival))
                            .map(e -> departure + " -> " + e.getKey().getCities().toString() + " -> " + e.getValue().getCities().toString())
                            .collect(Collectors.joining("\n")) + "\n";

        } else {
            return "Flights from " + departure + " to " + arrival + " available.\n";
        }
    }
}
