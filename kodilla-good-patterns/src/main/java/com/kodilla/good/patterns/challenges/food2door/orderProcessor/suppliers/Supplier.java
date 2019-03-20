package com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.InfoDTO;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.Order;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.ResourcesCatalog;

public interface Supplier {
    InfoDTO process(Order order, ResourcesCatalog resourcesCatalog);
}
