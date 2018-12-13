package com.kodilla.testing.collection;
import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList exterminate(ArrayList<Integer> numbers){
        ArrayList even = new ArrayList();
        for(int number : numbers) {
            if(number % 2 == 0) {
                even.add(number);
            }
        }
        return even;
    }
}
