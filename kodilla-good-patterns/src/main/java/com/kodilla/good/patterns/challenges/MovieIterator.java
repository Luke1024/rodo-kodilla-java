package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieIterator {
    public static void main(String[] args){

        MovieStore movieStore = new MovieStore();

        String moviesInString = movieStore.getMovies().entrySet().stream()
                .flatMap(n->n.getValue().stream().map(x->x + "  !  ")).collect(Collectors.joining());

        System.out.println(moviesInString.substring(0,moviesInString.length()-3));
    }
}
