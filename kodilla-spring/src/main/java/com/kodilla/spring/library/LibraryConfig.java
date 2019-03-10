package com.kodilla.spring.library;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {
    @Bean
    public Library library1() {
        return new Library(libraryDbController1());
    }

    @Bean
    public LibraryDbController libraryDbController1() {
        return new LibraryDbController();
    }
}