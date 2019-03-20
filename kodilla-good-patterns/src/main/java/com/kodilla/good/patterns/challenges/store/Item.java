package com.kodilla.good.patterns.challenges.store;

public class Item {
    private int itemID;
    private String itemName;

    public Item(int itemID, String itemName) {
        this.itemID = itemID;
        this.itemName = itemName;
    }

    public int getItemID() {
        return itemID;
    }
    public String getItemName() {
        return itemName;
    }
}
