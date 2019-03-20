package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

final class Continent {
    private final String continentName;
    private final List<Country> continents = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country){
        continents.add(country);
    }
    public List<BigDecimal> getCountries(){
        return continents.stream().map(country -> country.getNumberOfPeople()).collect(Collectors.toList());
    }
}
