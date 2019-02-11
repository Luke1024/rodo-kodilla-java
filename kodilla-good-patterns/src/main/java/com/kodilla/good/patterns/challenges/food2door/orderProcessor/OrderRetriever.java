package com.kodilla.good.patterns.challenges.food2door.orderProcessor;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers.Suppliers;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class OrderRetriever {

    public Order retrieve() {
        Customer customer = new Customer("John", "Smith");

        LocalDateTime orderPlacedTime = LocalDateTime.of(2018, 2, 8, 12, 5);

        List<FoodItem> itemList = Arrays.asList(
                new FoodItem("FattyButter", 4321,4, Suppliers.EXTRA_FOOD_SHOP),
                new FoodItem("MilkyMilk", 7654,2, Suppliers.GLUTEN_FREE_SHOP),
                new FoodItem("OilyOil",7867,1, Suppliers.HEALTHY_SHOP));

        return new Order(customer, orderPlacedTime, itemList);
    }
}
