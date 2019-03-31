package com.kodilla.sudoku.internals;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.sudoku.internals.SudokuElement.EMPTY_VALUE;

public class SudokuRow {

    private List<SudokuElement> row = new ArrayList<>();

    public SudokuRow() {
        row.add(new SudokuElement(EMPTY_VALUE));
    }
    public List<SudokuElement> getElement(int index) {
        return row;
    }
}
