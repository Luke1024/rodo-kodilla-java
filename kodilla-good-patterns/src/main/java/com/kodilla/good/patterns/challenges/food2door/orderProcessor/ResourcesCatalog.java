package com.kodilla.good.patterns.challenges.food2door.orderProcessor;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.dataRepository.DataRepositoryList;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.dataRepository.FoodStoreRepository;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.dataRepository.FoodStoreRepositoryCloud;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.informationService.InformationServiceList;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.informationService.MailService;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.informationService.SMSService;
import com.kodilla.good.patterns.challenges.food2door.orderProcessor.suppliers.*;

import java.util.*;

public class ResourcesCatalog {

    private Map<Suppliers, Supplier> suppliersList = new HashMap<>();

    private final InformationServiceList informationServiceList = new InformationServiceList(Arrays.asList(
            new MailService(),
            new SMSService()
    ));

    private final DataRepositoryList dataRepositoryList = new DataRepositoryList(Arrays.asList(
            new FoodStoreRepository(),
            new FoodStoreRepositoryCloud()
    ));

    public ResourcesCatalog() {
        suppliersList.put(Suppliers.EXTRA_FOOD_SHOP, new ExtraFoodShop());
        suppliersList.put(Suppliers.GLUTEN_FREE_SHOP, new GlutenFreeShop());
        suppliersList.put(Suppliers.HEALTHY_SHOP, new HealthyShop());
    }


    public Map<Suppliers, Supplier> getSuppliersList() {
        return suppliersList;
    }

    public InformationServiceList getInformationServiceList() {
        return informationServiceList;
    }

    public DataRepositoryList getDataRepositoryList() {
        return dataRepositoryList;
    }
}
