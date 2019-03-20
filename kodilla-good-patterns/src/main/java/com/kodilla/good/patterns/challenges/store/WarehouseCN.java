package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDateTime;
import java.util.List;

public class WarehouseCN implements Warehouse{
    public boolean placeOrder(final User user, final LocalDateTime orderPlacedTime, final List<Item> items) {
        System.out.println("Order for " + user.getName() + " " + user.getSurName() + " placed " + orderPlacedTime.toString() + " in preparation.");
        return true;
    }
}
