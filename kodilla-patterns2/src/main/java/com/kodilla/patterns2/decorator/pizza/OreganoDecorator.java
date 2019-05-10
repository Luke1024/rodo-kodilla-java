package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class OreganoDecorator extends AbstractPizzaOrderDecorator{
    public OreganoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }
    @Override
    public String getRecipe() {
        return super.getRecipe() + "\nAdd extra oregano.";
    }
}
