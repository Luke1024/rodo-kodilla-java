package com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.FoodItem;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.InfoDTO;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.Order;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.ResourcesCatalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HealthyShop implements Supplier {

    private List<FoodItem> stock = new ArrayList<>(Arrays.asList(
            new FoodItem("OilyOil", 7867, 5)));

    public InfoDTO process(Order order, ResourcesCatalog resourcesCatalog) {

        if (!order.getItems().isEmpty()) {
            if (!checkIfItemsAvailable(order).isEmpty()) {
                return orderSuccessful(order, resourcesCatalog);
            } else {
                String comment = "Requested item/s not available";
                return new InfoDTO(order.getCustomer(), false, comment);
            }
        } else {
            String comment = "Blank order.";
            return new InfoDTO(order.getCustomer(), false, comment);
        }
    }

    private List<FoodItem>  checkIfItemsAvailable(Order order) {
        List<FoodItem> itemsOrderedOnStock = new ArrayList<>();

        for (FoodItem foodItem : order.getItems()) {
            List<FoodItem> ordered = stock.stream()
                    .filter(item -> item.getItemID() == foodItem.getItemID())
                    .filter(item -> item.getItemQuantity() >= foodItem.getItemQuantity())
                    .collect(Collectors.toList());

            ordered.stream().forEach(itemsOrderedOnStock::add);
        }
        return itemsOrderedOnStock;
    }

    private InfoDTO orderSuccessful(Order order, ResourcesCatalog resourcesCatalog) {

        String comment = "Request from " + order.getCustomer().getName() + " "
                + order.getCustomer().getSurname() + " received " + order.getOrderPlacedTime() + "." +"\n" +
                "The customer will be informed on the basis of the information provided.";

        resourcesCatalog.getDataRepositoryList().getDataRepositories().get(0);

        return new InfoDTO(order.getCustomer(), true, comment);
    }
}
