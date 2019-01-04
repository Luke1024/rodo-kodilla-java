package com.kodilla.exception.test;

public class FindFlight {
    public static void main(String[] args){
        FlightFinder flightFinder = new FlightFinder();

        flightFinder.addAirport("A",true);
        flightFinder.addAirport("B", false);

        try {
            System.out.println("Flight is available: " + flightFinder.findFlight(new Flight("A", "B")));
        } catch (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Flight is available: " + flightFinder.findFlight(new Flight("D", "E")));
        } catch (RouteNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
