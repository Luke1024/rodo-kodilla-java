package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;

public class ZGeneration extends User{
    public ZGeneration(String name, String surname) {
        super(name, surname);
        this.socialPublisher = new FacebookPublisher();
    }
}
