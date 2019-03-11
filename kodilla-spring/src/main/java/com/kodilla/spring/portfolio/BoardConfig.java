package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    private TaskList toDolist;

    @Autowired
    @Qualifier("inProgressList")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDolist, inProgressList, doneList);
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
