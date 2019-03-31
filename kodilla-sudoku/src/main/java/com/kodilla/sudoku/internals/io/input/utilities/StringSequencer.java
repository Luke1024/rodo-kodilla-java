package com.kodilla.sudoku.internals.io.input.utilities;

import java.util.ArrayList;
import java.util.List;

public class StringSequencer {

    public List<Character> sequence(String input){
        List<Character> stringSequenced = new ArrayList<>();
        for(int i=0; i<input.length(); i++){
            stringSequenced.add(input.charAt(i));
        }
        return stringSequenced;
    }
}
