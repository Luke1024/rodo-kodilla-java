package com.kodilla.sudoku.internals.io.input.utilities.charprocessing;

public class CharAnalyzer {

    private char input;

    public CharAnalyzer(char input){
        this.input = input;
    }

    public CharDTO processChar(){
        return new CharDTO(
                isCharLetter(),
                isCharComma(),
                isCharAcceptableNumber(),
                isCharExitCommand(),
                isCharHelpCommand(),
                isCharRestartCommand());
    }


    private boolean isCharLetter() {
        return Character.isLetter(input);
    }

    private boolean isCharComma() {
        return input==',';
    }

    private boolean isCharAcceptableNumber() {
        if(Character.isDigit(input)){
            if(input>0 && input<10) return true;
            else return false;
        } else return false;
    }

    private boolean isCharExitCommand() {
        if(Character.isLetter(input)) {
            if(input=='x') return true;
            else return false;
        } else return false;
    }

    private boolean isCharHelpCommand(){
        if(Character.isLetter(input)) {
            if(input=='h') return true;
            else return true;
        } else return false;
    }

    private boolean isCharRestartCommand(){
        if(Character.isLetter(input)){
            if(input=='r') return true;
            else return true;
        } else return false;
    }
}
