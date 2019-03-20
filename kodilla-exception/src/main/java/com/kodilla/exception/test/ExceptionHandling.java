package com.kodilla.exception.test;

import java.time.LocalTime;

public class ExceptionHandling {
    public static void main(String args[]){
        SecondChallenge challenge = new SecondChallenge();

        try {
            System.out.println(challenge.probablyIWillThrowException(0,1.5));
        } catch (Exception e){
            System.out.println("Error! Something wrong with this method.");
            System.out.println(e);
        } finally {
            System.out.println("Program finished: " + LocalTime.now());
        }
    }
}
