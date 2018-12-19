package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Awesome Text", text -> text.toLowerCase());
        poemBeautifier.beautify("NOT Awesome Text ", text -> "<<@ " + text + " @>>");
        poemBeautifier.beautify("Release The Kraken!", text -> "<<<@@@ " + text.toUpperCase() + " @@@>>>");
    }
}
