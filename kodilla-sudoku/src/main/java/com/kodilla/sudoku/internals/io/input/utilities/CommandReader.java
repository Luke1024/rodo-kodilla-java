package com.kodilla.sudoku.internals.io.input.utilities;

import java.util.Scanner;

public class CommandReader {
    private Scanner scanner = new Scanner(System.in);

    public String read(){
        return scanner.nextLine();
    }
}
