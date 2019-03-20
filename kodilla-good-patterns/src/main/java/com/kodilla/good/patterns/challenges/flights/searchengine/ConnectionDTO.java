package com.kodilla.good.patterns.challenges.flights.searchengine;

import java.util.ArrayList;
import java.util.List;

public class ConnectionDTO {
    private Mode requestMode;
    private List<City> request;
    private List<Connection> connections = new ArrayList<>();

    public ConnectionDTO(Mode requestMode, List<City> request, List<Connection> connections) {
        this.requestMode = requestMode;
        this.request = request;
        this.connections = connections;
    }

    public Mode getRequestMode() {
        return requestMode;
    }

    public List<City> getRequest() {
        return request;
    }

    public List<Connection> getConnections() {
        return connections;
    }
}
