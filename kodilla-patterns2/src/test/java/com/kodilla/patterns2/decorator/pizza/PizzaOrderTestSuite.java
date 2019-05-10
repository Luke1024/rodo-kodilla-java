package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetRecipe() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String description = pizzaOrder.getRecipe();
        //Then
        assertEquals("Basic pizza with tomato sauce and cheese.", description);
    }

    @Test
    public void testPizzaMarinaraGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMarinaraOrderDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), theCost);
    }
    @Test
    public void testPizzaMarinaraGetRecipe() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMarinaraOrderDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getRecipe();
        //Then
        assertEquals("Basic pizza with tomato sauce and cheese.\nAdd tomatoes, garlic, oregano, and extra virgin olive oil.", description);
    }

    @Test
    public void testPizzaMarinaraWithExtraCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMarinaraOrderDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), theCost);
    }
    @Test
    public void testPizzaMarinaraWithExtraCheeseGetRecipe() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMarinaraOrderDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getRecipe();
        //Then
        assertEquals("Basic pizza with tomato sauce and cheese.\nAdd tomatoes, garlic, oregano, and extra virgin olive oil.\nAdd extra cheese.", description);
    }

    @Test
    public void testPizzaMargheritaWithDoubleExtraCheeseGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMargheritaOrderDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), theCost);
    }
    @Test
    public void testPizzaMargheritaWithDoubleExtraCheeseGetRecipe() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMargheritaOrderDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getRecipe();
        //Then
        assertEquals("Basic pizza with tomato sauce and cheese.\nAdd tomatoes, sliced mozzarella, basil and extra virgin olive oil.\nAdd extra cheese.\nAdd extra cheese.", description);
    }

    @Test
    public void testPizzaMargheritaExtraWithExtraCheeseAndOreganoGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMargheritaExtraOrderDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new OreganoDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(42), theCost);
    }
    @Test
    public void testPizzaMargheritaExtraWithExtraCheeseAndOreganoGetRecipe() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaMargheritaExtraOrderDecorator(pizzaOrder);
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new OreganoDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getCost());
        //When
        String description = pizzaOrder.getRecipe();
        //Then
        assertEquals("Basic pizza with tomato sauce and cheese.\nAdd tomatoes, mozzarella from Campania, basil and extra virgin olive oil.\nAdd extra cheese.\nAdd extra oregano.", description);
    }
}
