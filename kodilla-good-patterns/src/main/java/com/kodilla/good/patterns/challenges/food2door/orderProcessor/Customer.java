package com.kodilla.good.patterns.challenges.food2door.orderProcessor;

public class Customer {
    private String name;
    private String surname;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
