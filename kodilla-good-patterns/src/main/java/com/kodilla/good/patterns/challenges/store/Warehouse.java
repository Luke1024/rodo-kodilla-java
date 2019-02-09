package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDateTime;
import java.util.List;

public interface Warehouse {
    boolean placeOrder(final User user, final LocalDateTime orderPlacedTime, final List<Item> items);
}
