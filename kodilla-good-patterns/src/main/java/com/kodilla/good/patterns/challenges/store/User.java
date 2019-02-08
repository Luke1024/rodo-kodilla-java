package com.kodilla.good.patterns.challenges.store;

public class User {
    private String name;
    private String surName;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public User(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
}
