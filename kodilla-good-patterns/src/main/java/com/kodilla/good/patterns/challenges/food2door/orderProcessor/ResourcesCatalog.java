package com.kodilla.good.patterns.challenges.food2door.orderProcessor;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.dataRepository.DataRepositoriesPack;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.dataRepository.FoodStoreRepository;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.dataRepository.FoodStoreRepositoryCloud;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.informationService.InformationServicesPack;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.informationService.MailService;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.informationService.SMSService;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers.HealthyShop;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers.Supplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResourcesCatalog {

    private final List<Supplier> suppliersList = new ArrayList<>(Arrays.asList(
            new ExtraFoodShop(),
            new GlutenFreeShop(),
            new HealthyShop()
    ));

    private final InformationServicesPack informationServiceList = new InformationServicesPack(Arrays.asList(
            new MailService(),
            new SMSService()
    ));

    private final DataRepositoriesPack dataRepositoryList = new DataRepositoriesPack(Arrays.asList(
            new FoodStoreRepository(),
            new FoodStoreRepositoryCloud()
    ));


    public List<Supplier> getSuppliersList() {
        return suppliersList;
    }

    public InformationServicesPack getInformationServiceList() {
        return informationServiceList;
    }

    public DataRepositoriesPack getDataRepositoryList() {
        return dataRepositoryList;
    }
}
