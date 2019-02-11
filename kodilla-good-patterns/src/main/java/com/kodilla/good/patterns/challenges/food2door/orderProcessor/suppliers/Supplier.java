package com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.Order;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.OrderDTO;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.ResourcesCatalog;

public interface Supplier {
    OrderDTO process(Order order, ResourcesCatalog resourcesCatalog);
}
