package com.kodilla.good.patterns.challenges.store;

public class MailServiceDE implements MailService {
    public void inform(User user){
        System.out.println("Sending information to " + user.getName() + " " + user.getSurName() + ".");
    }
}
