package com.kodilla.good.patterns.challenges.food2door.orderProcessor.dataRepository;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.Order;

public interface DataRepository {
    void archiveOrder(Order order);
}
