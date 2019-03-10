package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;

public class Millenials extends User {
    public Millenials(String name, String surname) {
        super(name, surname);
        this.socialPublisher = new SnapchatPublisher();
    }
}
