package com.kodilla.good.patterns.challenges.store;

public class OrderProcessor {
    private MailService mailService;
    private Warehouse warehouse;
    private StoreRepository storeRepository;

    public OrderProcessor(final MailService mailService,
                          final Warehouse warehouse,
                          final StoreRepository storeRepository) {
        this.mailService=mailService;
        this.warehouse=warehouse;
        this.storeRepository=storeRepository;
    }

    public OrderDto process(final Order order){
        boolean isOrdered = warehouse.placeOrder(order.getUser(), order.getOrderPlacedTime(), order.getItems());
        if(isOrdered){
            mailService.inform(order.getUser());
            storeRepository.createOrder(order.getUser(), order.getOrderPlacedTime(), order.getItems());
            return new OrderDto(order.getUser(), true);
        } else {
            return new OrderDto(order.getUser(), false);
        }
    }
}
