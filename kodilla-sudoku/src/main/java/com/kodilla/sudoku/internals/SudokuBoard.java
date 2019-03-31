package com.kodilla.sudoku.internals;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private List<SudokuRow> board = new ArrayList<>();

    public SudokuBoard() {
        for (int i = 0; i<9; i++) {
            board.add(new SudokuRow());
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
