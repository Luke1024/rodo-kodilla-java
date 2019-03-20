package com.kodilla.good.patterns.challenges.store;

public class OrderingApplication {
    public static void main(String[] args) {
        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailServiceDE(), new WarehouseCN(), new StoreRepositoryUK());
        orderProcessor.process(order);
    }
}
