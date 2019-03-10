package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;

public class YGeneration extends User {
    public YGeneration(String name, String surname) {
        super(name, surname);
        this.socialPublisher = new TwitterPublisher();
    }
}
