package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMargheritaOrderDecorator extends AbstractPizzaOrderDecorator {
    public PizzaMargheritaOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getRecipe() {
        return super.getRecipe() + "\nAdd tomatoes, sliced mozzarella, basil and extra virgin olive oil.";
    }
}
