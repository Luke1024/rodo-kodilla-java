package com.kodilla.good.patterns.challenges.store;

public class MailService {
    public void inform(User user){
        System.out.println("Sending information to " + user.getName() + " " + user.getSurName() + ".");
    }
}
