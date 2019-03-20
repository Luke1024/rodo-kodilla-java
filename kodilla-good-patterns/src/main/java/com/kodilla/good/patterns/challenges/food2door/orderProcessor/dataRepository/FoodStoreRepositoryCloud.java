package com.kodilla.good.patterns.challenges.food2door.orderProcessor.dataRepository;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.Order;

public class FoodStoreRepositoryCloud implements DataRepository {
    public void archiveOrder(Order order) {
        System.out.println("Backup order for " + order.getCustomer().getName() + " "
                + order.getCustomer().getSurname() + " archived "
                + order.getOrderPlacedTime().toString());
    }
}
