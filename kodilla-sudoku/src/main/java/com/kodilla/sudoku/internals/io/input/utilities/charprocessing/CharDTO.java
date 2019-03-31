package com.kodilla.sudoku.internals.io.input.utilities.charprocessing;


public class CharDTO {
    private boolean isLetter;
    private boolean isComma;
    private boolean isAcceptableNumber;
    private boolean isExit;
    private boolean isHelp;
    private boolean isRestart;

    public CharDTO(boolean isLetter, boolean isComma, boolean isAcceptableNumber, boolean isExit, boolean isHelp, boolean isRestart) {
        this.isLetter = isLetter;
        this.isComma = isComma;
        this.isAcceptableNumber = isAcceptableNumber;
        this.isExit = isExit;
        this.isHelp = isHelp;
        this.isRestart = isRestart;
    }

    public boolean isLetter() {
        return isLetter;
    }

    public boolean isComma() {
        return isComma;
    }

    public boolean isAcceptableNumber() {
        return isAcceptableNumber;
    }

    public boolean isExit() {
        return isExit;
    }

    public boolean isHelp() {
        return isHelp;
    }

    public boolean isRestart() {
        return isRestart;
    }
}
