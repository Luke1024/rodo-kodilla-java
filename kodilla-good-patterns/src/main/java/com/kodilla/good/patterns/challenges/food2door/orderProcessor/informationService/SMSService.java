package com.kodilla.good.patterns.challenges.food2door.orderProcessor.informationService;

import com.kodilla.good.patterns.challenges.food2door.orderProcessor.Customer;

public class SMSService implements InformationService{
    public void inform(Customer user){
        System.out.println("Sending sms to " + user.getName() + " " + user.getSurname() + ".");
    }
}
