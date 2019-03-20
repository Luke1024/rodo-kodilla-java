package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private User user;
    private LocalDateTime orderPlacedTime;
    private List<Item> items;

    public Order(User user, LocalDateTime orderPlacedTime, List<Item> items) {
        this.user = user;
        this.orderPlacedTime = orderPlacedTime;
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderPlacedTime() {
        return orderPlacedTime;
    }

    public List<Item> getItems() {
        return items;
    }
}
