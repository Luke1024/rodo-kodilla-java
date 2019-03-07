package com.kodilla.good.patterns.challenges.flights.searchengine;

import java.util.*;
import java.util.stream.Collectors;

public class SearchEngine {

    private FlightsDatabase flightsDatabase;

    public SearchEngine(FlightsDatabase flightsDatabase) {
        this.flightsDatabase = flightsDatabase;
    }

    public ConnectionDTO citiesAvailableFromDepartureCity(City city){

        Map<Flight, FlightData> availableFlights = flightsDatabase.getDatabase().entrySet().stream()
                .filter(f->f.getKey().getDeparture().equals(city))
                .collect(Collectors.toMap(f -> f.getKey(), f -> f.getValue()));

        return getLastFlights(new LastFlightsDTO(Mode.FROM, new ArrayList<City>(Arrays.asList(city)), availableFlights));
    }

    public ConnectionDTO citiesAvailableToArrivalCity(City city){

        Map<Flight, FlightData> availableFlights = flightsDatabase.getDatabase().entrySet().stream()
                .filter(f->f.getKey().getArrival().equals(city))
                .collect(Collectors.toMap(f -> f.getKey(), f->f.getValue()));

        return getLastFlights(new LastFlightsDTO(Mode.TO, new ArrayList<City>(Arrays.asList(city)), availableFlights));
    }

    public ConnectionDTO fromTo(City cityFrom, City cityTo) {


        Map<Flight, FlightData> directFlights =
                flightsDatabase.getDatabase().entrySet().stream()
                        .filter(f -> f.getKey().getDeparture().equals(cityFrom) && f.getKey().getArrival().equals(cityTo))
                        .collect(Collectors.toMap(f -> f.getKey(), f->f.getValue()));

        if (directFlights.isEmpty()) {
            return routeSearch(cityFrom, cityTo);
        } else {
            return getLastFlights(new LastFlightsDTO(Mode.FROM_TO, new ArrayList<>(Arrays.asList(cityFrom, cityTo)), directFlights));
        }
    }

    private ConnectionDTO getLastFlights(LastFlightsDTO lastFlightsDTO) {

        List<Connection> tempConnectionList = new ArrayList<>();

        for (Map.Entry<Flight, FlightData> availableFlight : lastFlightsDTO.getAvailableFlights().entrySet()) {

            LinkedHashMap<Flight, FlightData> tempFlights = new LinkedHashMap<>();

            tempFlights.put(availableFlight.getKey(), availableFlight.getValue());
            Connection connection = new Connection(tempFlights);
            tempConnectionList.add(connection);
        }
        return new ConnectionDTO(lastFlightsDTO.getMode(), lastFlightsDTO.getCityList(), tempConnectionList);
    }

    public ConnectionDTO routeSearch(City cityFrom, City cityTo) {

        Map<Flight, FlightData> endFlights = flightsDatabase.getDatabase().entrySet().stream()
                .filter(f -> f.getKey().getArrival().equals(cityTo))
                .collect(Collectors.toMap(f-> f.getKey(), f->f.getValue()));

        List<Connection> tempConnectionList = new ArrayList<>();

        for(Map.Entry<Flight, FlightData> endFlight : endFlights.entrySet()) {
            for (Map.Entry<Flight, FlightData> entry : flightsDatabase.getDatabase().entrySet()) {

                Map.Entry<Flight, FlightData> startFlight = null;

                if (entry.getKey().getArrival().equals(endFlight.getKey().getDeparture())
                && entry.getKey().getDeparture().equals(cityFrom)) {

                    startFlight = entry;
                }

                if (startFlight != null) {
                    LinkedHashMap<Flight, FlightData> tempFlight = new LinkedHashMap<>();
                    tempFlight.put(startFlight.getKey(), startFlight.getValue());
                    tempFlight.put(endFlight.getKey(), endFlight.getValue());

                    Connection connection = new Connection(tempFlight);
                    tempConnectionList.add(connection);
                }
            }
        }
        return new ConnectionDTO(Mode.FROM_TO, new ArrayList<>(Arrays.asList(cityFrom, cityTo)), tempConnectionList);
    }
}
