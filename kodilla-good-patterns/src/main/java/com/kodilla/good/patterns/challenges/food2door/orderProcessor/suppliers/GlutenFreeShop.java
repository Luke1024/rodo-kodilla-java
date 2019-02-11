package com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.*;

public class GlutenFreeShop implements Supplier {
    public OrderDTO process(Order order, ResourcesCatalog resourcesCatalog) {

        String comment = "Items for " + order.getCustomer().getName() + " "
                + order.getCustomer().getSurname() + " in production. " + "Order received " + order.getOrderPlacedTime() + "."  + "\n" +
                "The customer will be informed on the basis of the information provided. GlutenFreeShop will archive information about order.";

        return new OrderDTO(order.getCustomer(), true, comment);
    }
}
