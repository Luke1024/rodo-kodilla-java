package com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.*;

public class ExtraFoodShop implements Supplier {
    public OrderDTO process(Order order, ResourcesCatalog resourcesCatalog) {

        String comment = "Order for " + order.getCustomer().getName() + " "
                + order.getCustomer().getSurname() + " received " + order.getOrderPlacedTime() + " . Order in preparation." + "\n" +
                "Expected delivery time " + order.getOrderPlacedTime().plusDays(5);

        resourcesCatalog.getInformationServiceList().getInformationServices().stream()
                .forEach(informationService -> informationService.inform(order.getCustomer()));

        resourcesCatalog.getDataRepositoryList().getDataRepositories().stream()
                .forEach(dataRepository -> dataRepository.archiveOrder(order));

        return new OrderDTO(order.getCustomer(), true, comment);
    }
}
