package com.kodilla.good.patterns.challenges.food2door.orderProcessor.informationService;

import java.util.List;

public class InformationServiceList {
    private List<InformationService> informationServices;

    public InformationServiceList(List<InformationService> informationServices) {
        this.informationServices = informationServices;
    }

    public List<InformationService> getInformationServices() {
        return informationServices;
    }
}
