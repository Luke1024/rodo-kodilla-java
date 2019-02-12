package com.kodilla.good.patterns.challenges.food2door.orderProcessor;

import java.util.ArrayList;
import java.util.List;

public class OrderAllocator {
    public List<InfoDTO> allocateAndProcessOrder(Order order, ResourcesCatalog resourcesCatalog) {

        List<InfoDTO> statusInfo = new ArrayList<>();

        for(int i=0; i<resourcesCatalog.getSuppliersList().size(); i++){
            statusInfo.add(resourcesCatalog.getSuppliersList().get(i).process(order, resourcesCatalog));
        }

        return statusInfo;
    }
}
