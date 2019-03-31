package com.kodilla.sudoku.internals.io.input.utilities;

public class SudokuElementParameters {
    private int positionX;
    private int positionY;
    private int value;

    public SudokuElementParameters(int positionX, int positionY, int value) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.value = value;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getValue() {
        return value;
    }
}
