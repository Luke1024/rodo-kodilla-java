package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {
    @Bean
    public Board getBoard() {
        return new Board(getToDo(), getInProgress(), getDone());
    }

    @Bean(name = "toDoList")
    public TaskList getToDo() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgress() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList getDone() {
        return new TaskList();
    }
}
