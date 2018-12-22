package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        //Create countries

        //asia
        Country country1 = new Country("China",  new BigDecimal("1370793000"));
        Country country2 = new Country("India",  new BigDecimal("1200499000"));
        Country country3 = new Country("Indonesia", new BigDecimal("255462000"));
        Country country4 = new Country("Pakistan", new BigDecimal( "201785000"));
        Country country5 = new Country("Bangladesh", new BigDecimal("158762000"));
        Country country6 = new Country("Russia", new BigDecimal("144031000"));

        Continent asia = new Continent("Asia");

        asia.addCountry(country1);
        asia.addCountry(country2);
        asia.addCountry(country3);
        asia.addCountry(country4);
        asia.addCountry(country5);
        asia.addCountry(country6);

        //north america
        Country country7 = new Country("United States", new BigDecimal("327929000"));
        Country country8 = new Country("Mexico", new BigDecimal("124737789"));

        Continent northAmerica = new Continent("North America");

        northAmerica.addCountry(country7);
        northAmerica.addCountry(country8);

        //south america
        Country country9 = new Country("Brazil", new BigDecimal("204519000"));
        Country country10 = new Country("Colombia", new BigDecimal("48549000"));

        Continent southAmerica = new Continent("South America");

        southAmerica.addCountry(country9);
        southAmerica.addCountry(country10);

        //africa
        Country country11 = new Country("Nigeria", new BigDecimal("195875000"));
        Country country12 = new Country("Ethiopia", new BigDecimal("107534000"));

        Continent africa = new Continent("Africa");

        africa.addCountry(country11);
        africa.addCountry(country12);


        //When
        World world = new World();

        world.addContinent(asia);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);
        world.addContinent(africa);

        //Then
        Assert.assertEquals(new BigDecimal("4340475789") ,world.getPeopleQuantity());
    }
}
