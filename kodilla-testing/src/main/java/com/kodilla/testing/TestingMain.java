package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int result = calc.add(5,3);

        if(result==8){
            System.out.println("Adding ok.");
        } else {
            System.out.println("Adding error.");
        }

        result = calc.subtract(5,3);

        if(result==2){
            System.out.println("Subtracting ok.");
        } else {
            System.out.println("Subtracting error!");
        }
    }
}