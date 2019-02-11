package com.kodilla.good.patterns.challenges.food2door;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.*;

import java.util.List;

public class Food2Door {
    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        ResourcesCatalog resourcesCatalog = new ResourcesCatalog();

        OrderAllocator orderAllocator = new OrderAllocator();

        List<OrderDTO> orderInfo = orderAllocator.allocateAndProcessOrder(order, resourcesCatalog);

        orderInfo.stream().map(orderDTO -> orderDTO.getComment()).forEach(System.out::println);
    }
}
