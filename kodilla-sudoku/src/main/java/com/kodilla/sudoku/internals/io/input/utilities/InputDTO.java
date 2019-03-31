package com.kodilla.sudoku.internals.io.input.utilities;

import java.util.List;

public class InputDTO {
    private SpecialCommand command;
    private List<SudokuElementParameters> sudokuElementsParameters;

    public InputDTO(SpecialCommand command, List<SudokuElementParameters> sudokuElementsParameters) {
        this.command = command;
        this.sudokuElementsParameters = sudokuElementsParameters;
    }

    public SpecialCommand getCommand() {
        return command;
    }

    public List<SudokuElementParameters> getSudokuElementsParameters() {
        return sudokuElementsParameters;
    }
}
