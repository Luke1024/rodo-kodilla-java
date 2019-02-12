package com.kodilla.good.patterns.challenges.food2door.orderProcessor.dataRepository;

import java.util.List;

public class DataRepositoriesPack {
    private List<DataRepository> dataRepositories;

    public DataRepositoriesPack(List<DataRepository> dataRepositories) {
        this.dataRepositories = dataRepositories;
    }

    public List<DataRepository> getDataRepositories() {
        return dataRepositories;
    }
}
