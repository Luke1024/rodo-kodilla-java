package com.kodilla.sudoku.internals.io.input;

import com.kodilla.sudoku.internals.io.input.utilities.*;
import com.kodilla.sudoku.internals.io.input.utilities.charprocessing.CharAnalyzer;
import com.kodilla.sudoku.internals.io.input.utilities.charprocessing.CharDTO;
import com.kodilla.sudoku.internals.io.input.utilities.CommandSequencer;

import java.util.ArrayList;
import java.util.List;

public class SudokuInput {

    private CommandReader commandReader;
    private StringSequencer stringSequencer;
    private CharAnalyzer charAnalyzer;
    private CommandSequencer commandSequencer;

    public InputDTO readAndProcessInput() {
        String input = commandReader.read();

        if (input.length() == 1) {
            return checkIfControlCommand(input);
        } else if (input.length() >= 3) {
            return processCoordinates(input);
        } else return emptyCommand();
    }

    private InputDTO checkIfControlCommand(String input){
        CharAnalyzer charAnalyzer = new CharAnalyzer(input.charAt(0));
        CharDTO charDTO = charAnalyzer.processChar();
        SpecialCommand command = singleCharToCommandConverter(charDTO);
        return new InputDTO(command, new ArrayList<>());
    }

    private InputDTO processCoordinates(String input){
        List<Character> chars = stringSequencer.sequence(input);
        List<Integer> numbers = filterNumbers(chars);
        return commandSequencer.sequence(numbers);
    }

    private List<Integer> filterNumbers(List<Character> chars){

        List<Integer> numbers = new ArrayList<>();

        for(int i=0; i<chars.size(); i++){
            CharAnalyzer charAnalyzer = new CharAnalyzer(chars.get(i));
            CharDTO charDTO = charAnalyzer.processChar();
            if(charDTO.isAcceptableNumber()){
                numbers.add((int) chars.get(i));
            }
        }
        return numbers;
    }

    private SpecialCommand singleCharToCommandConverter(CharDTO charDTO){

        if(charDTO.isExit()) return SpecialCommand.EXIT;
        else if(charDTO.isHelp()) return SpecialCommand.HELP;
        else if(charDTO.isRestart()) return SpecialCommand.RESTART;
        else return SpecialCommand.EMPTYVALUES;
    }

    private InputDTO emptyCommand(){
        return new InputDTO(SpecialCommand.EMPTYVALUES, new ArrayList<SudokuElementParameters>());
    }
}
