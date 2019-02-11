package com.kodilla.good.patterns.challenges.food2door.orderProcessor;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers.Suppliers;

import java.util.ArrayList;
import java.util.List;

public class OrderAllocator {
    public List<OrderDTO> allocateAndProcessOrder(Order order, ResourcesCatalog resourcesCatalog) {
        List<OrderDTO> orderInfo = new ArrayList<>();
        for (int i = 0; i < order.getItems().size(); i++) {
            Suppliers suppliers = order.getItems().get(i).getSuppliers();
            orderInfo.add(resourcesCatalog.getSuppliersList().get(suppliers).process(order,resourcesCatalog));
        }
        return orderInfo;
    }
}
