package com.kodilla.good.patterns.challenges.food2door.orderProcessor;

public class FoodItem {
    private String name;
    private long itemID;
    private int itemQuantity;

    public FoodItem(String name, long itemID, int itemQuantity) {
        this.name = name;
        this.itemID = itemID;
        this.itemQuantity = itemQuantity;
    }

    public String getName() {
        return name;
    }

    public long getItemID() {
        return itemID;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }
}
