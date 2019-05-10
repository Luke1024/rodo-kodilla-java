package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaMarinaraOrderDecorator extends AbstractPizzaOrderDecorator {
    public PizzaMarinaraOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getRecipe() {
        return super.getRecipe() + "\nAdd tomatoes, garlic, oregano, and extra virgin olive oil.";
    }
}
