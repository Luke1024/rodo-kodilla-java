package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDateTime;
import java.util.List;

public class StoreRepository {
    public void createOrder(User user, LocalDateTime orderPlacedTime, List<Item> items) {
        System.out.println("Order for user " + user.getName() + " " + user.getSurName() + " created "
                + orderPlacedTime.toString());
    }
}
