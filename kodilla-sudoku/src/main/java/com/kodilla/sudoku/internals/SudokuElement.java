package com.kodilla.sudoku.internals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SudokuElement {
    private int value;
    private List<Integer> availableNumbers =
            new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

    public SudokuElement(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void checkAndDelete(int number){
        if(availableNumbers.contains(number)){
            availableNumbers.remove(number);
        }
    }

    public List<Integer> getAvailableNumbers(){
        return availableNumbers;
    }
}
