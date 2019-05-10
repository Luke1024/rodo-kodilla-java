package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMargheritaExtraOrderDecorator extends AbstractPizzaOrderDecorator {
    public PizzaMargheritaExtraOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getRecipe() {
        return super.getRecipe() + "\nAdd tomatoes, mozzarella from Campania, basil and extra virgin olive oil.";
    }
}
