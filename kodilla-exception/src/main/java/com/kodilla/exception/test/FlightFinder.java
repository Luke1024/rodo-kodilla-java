package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    Map<String, Boolean> airPorts = new HashMap();

    void addAirport(String airPort, boolean isAvailable){
        airPorts.put(airPort,isAvailable);
    }

    boolean findFlight(Flight flight) throws RouteNotFoundException{
        if (airPorts.containsKey(flight.getArrivalAirport())){
            return airPorts.get(flight.getArrivalAirport());
        }
        else {
            throw new RouteNotFoundException("Route not found!");
        }
    }
}
