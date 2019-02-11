package com.kodilla.good.patterns.challenges.food2door.orderProcessor;

public class OrderDTO {
    private Customer customer;
    private boolean ordered;
    private String comment;

    public OrderDTO(Customer customer, boolean ordered, String comment) {
        this.customer = customer;
        this.ordered = ordered;
        this.comment = comment;
    }

    public Customer getCustomer() {
        return customer;
    }
    public boolean getOrdered() {
        return ordered;
    }
    public String getComment() {
        return comment;
    }
}
