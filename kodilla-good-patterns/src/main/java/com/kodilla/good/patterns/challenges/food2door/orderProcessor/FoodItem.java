package com.kodilla.good.patterns.challenges.food2door.orderProcessor;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers.Suppliers;

public class FoodItem {
    private String name;
    private long itemID;
    private int itemQuantity;
    private Suppliers suppliers;

    public FoodItem(String name, long itemID, int itemQuantity, Suppliers suppliers) {
        this.name = name;
        this.itemID = itemID;
        this.itemQuantity = itemQuantity;
        this.suppliers = suppliers;
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

    public Suppliers getSuppliers() {
        return suppliers;
    }
}
