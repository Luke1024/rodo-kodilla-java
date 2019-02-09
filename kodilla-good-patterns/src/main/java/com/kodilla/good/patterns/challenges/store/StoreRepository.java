package com.kodilla.good.patterns.challenges.store;

import java.time.LocalDateTime;
import java.util.List;

public interface StoreRepository {
    void createOrder(User user, LocalDateTime orderPlacedTime, List<Item> items);
}
