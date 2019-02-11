package com.kodilla.good.patterns.challenges.food2door.orderProcessor;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private Customer customer;
    private LocalDateTime orderPlacedTime;
    private List<FoodItem> items;

    public Order(Customer customer, LocalDateTime orderPlacedTime, List<FoodItem> items) {
        this.customer = customer;
        this.orderPlacedTime = orderPlacedTime;
        this.items = items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getOrderPlacedTime() {
        return orderPlacedTime;
    }

    public List<FoodItem> getItems() {
        return items;
    }
}
