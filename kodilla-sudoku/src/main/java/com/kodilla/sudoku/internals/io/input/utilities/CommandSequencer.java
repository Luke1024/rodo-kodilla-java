package com.kodilla.sudoku.internals.io.input.utilities;

import java.util.ArrayList;
import java.util.List;

public class CommandSequencer {

    public InputDTO sequence(List<Integer> input){

        List<SudokuElementParameters> elementParameters = new ArrayList<>();

        int inputSize = input.size();
        int commandsNumber = inputSize/3;
        for(int i=0; i<commandsNumber; i++){
            new SudokuElementParameters(input.get(i),input.get(i+1),input.get(i+2));
        }
        return new InputDTO(SpecialCommand.NONE, elementParameters);
    }
}
