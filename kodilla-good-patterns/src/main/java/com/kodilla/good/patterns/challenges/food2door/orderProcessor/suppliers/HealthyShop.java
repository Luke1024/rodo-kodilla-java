package com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.Order;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.OrderDTO;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.ResourcesCatalog;

public class HealthyShop implements Supplier {

    public OrderDTO process(Order order, ResourcesCatalog resourcesCatalog) {

        String comment = "Request from " + order.getCustomer().getName() + " "
                + order.getCustomer().getSurname() + " received " + order.getOrderPlacedTime() + "." +"\n" +
                "The customer will be informed on the basis of the information provided.";

        resourcesCatalog.getDataRepositoryList().getDataRepositories().get(0);

        return new OrderDTO(order.getCustomer(), true, comment);
    }
}
