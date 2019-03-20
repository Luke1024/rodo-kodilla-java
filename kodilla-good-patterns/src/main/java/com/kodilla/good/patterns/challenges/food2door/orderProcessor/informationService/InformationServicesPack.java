package com.kodilla.good.patterns.challenges.food2door.orderProcessor.informationService;

import java.util.List;

public class InformationServicesPack {
    private List<InformationService> informationServices;

    public InformationServicesPack(List<InformationService> informationServices) {
        this.informationServices = informationServices;
    }

    public List<InformationService> getInformationServices() {
        return informationServices;
    }
}
