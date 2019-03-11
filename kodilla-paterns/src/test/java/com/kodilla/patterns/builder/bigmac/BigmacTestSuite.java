package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient(Ingredient.BEKON)
                .bun(BunSesameContent.Z_SEZAMEM)
                .sauce(Sauce.STANDARD)
                .ingredient(Ingredient.CEBULA)
                .ingredient(Ingredient.PIECZARKI)
                .ingredient(Ingredient.SER)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}