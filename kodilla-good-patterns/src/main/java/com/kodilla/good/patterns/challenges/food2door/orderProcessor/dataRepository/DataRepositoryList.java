package com.kodilla.good.patterns.challenges.food2door.orderProcessor.dataRepository;

import java.util.List;

public class DataRepositoryList {
    private List<DataRepository> dataRepositories;

    public DataRepositoryList(List<DataRepository> dataRepositories) {
        this.dataRepositories = dataRepositories;
    }

    public List<DataRepository> getDataRepositories() {
        return dataRepositories;
    }
}
