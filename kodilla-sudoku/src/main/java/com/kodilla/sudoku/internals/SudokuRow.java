package com.kodilla.sudoku.internals;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private List<SudokuElement> row = new ArrayList<>();

    public SudokuRow() {
        row.add(new SudokuElement(-1));
    }
    public List<SudokuElement> getElement(int index) {
        return row;
    }
}
