package com.kodilla.good.patterns.challenges.flights.printer;

import com.kodilla.good.patterns.challenges.flights.searchengine.*;

import java.util.Map;
import java.util.stream.Collectors;

public class Printer {

    public void printFlight(ConnectionDTO connectionDTO) {
        if(connectionDTO.getRequestMode()== Mode.FROM){
            System.out.println("Flights available from: " + connectionDTO.getRequest());
            for(Connection connection : connectionDTO.getConnections()){
                for(Map.Entry<Flight, FlightData> flight : connection.getConnection().entrySet()) {
                    System.out.println(flight.getKey().getDeparture() + " => " + flight.getKey().getArrival());
                }
            }
            System.out.println();
        }

        if(connectionDTO.getRequestMode()==Mode.TO){
            System.out.println("Flights available to: " + connectionDTO.getRequest());
            for(Connection connection : connectionDTO.getConnections()) {
                for(Map.Entry<Flight, FlightData> flight : connection.getConnection().entrySet()) {
                    System.out.println(flight.getKey().getDeparture() + " => " + flight.getKey().getArrival());
                }
            }
            System.out.println();
        }

        if(connectionDTO.getRequestMode()==Mode.FROM_TO){
            System.out.println("Flights from " + connectionDTO.getRequest().get(0)
                    + " to " + connectionDTO.getRequest().get(1) + " : ");
            for(Connection connection : connectionDTO.getConnections()) {
                System.out.println(connection.getConnection().entrySet().stream()
                        .map(c-> "[" + c.getKey().getDeparture() + " => " + c.getKey().getArrival() + "]")
                        .collect(Collectors.joining("  =>  ")));
            }
            System.out.println();
        }
    }
}
