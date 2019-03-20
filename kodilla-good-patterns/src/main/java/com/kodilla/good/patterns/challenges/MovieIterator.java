package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieIterator {
    public static void main(String[] args){

        MovieStore movieStore = new MovieStore();

        System.out.println(movieStore.getMovies().entrySet().stream()
                .flatMap(n->n.getValue().stream())
                .collect(Collectors.joining("  !  ")));
    }
}
