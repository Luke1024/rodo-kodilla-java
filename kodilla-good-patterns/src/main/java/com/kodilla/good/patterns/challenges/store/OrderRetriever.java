package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class OrderRetriever {

    public Order retrieve() {
        User user = new User("John", "Smith");

        LocalDateTime orderPlacedTime = LocalDateTime.of(2018, 2, 8, 12, 5);

        List<Item> itemList = Arrays.asList(new Item(4321, "Propeller 5x4x3"), new Item(5421, "Battery 4s 1300mah"));

        return new Order(user,orderPlacedTime, itemList);
    }
}
