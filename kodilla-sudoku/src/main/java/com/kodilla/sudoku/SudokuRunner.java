package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args ) {
        boolean gameFinished = false;
        while (!gameFinished) {
            SudokuRunner theGame = new SudokuRunner();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
