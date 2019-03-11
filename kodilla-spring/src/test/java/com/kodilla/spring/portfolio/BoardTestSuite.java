package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getToDoList().addTask("drink water");
        board.getInProgressList().addTask("program the program");
        board.getDoneList().addTask("eat dinner");


        Assert.assertEquals("drink water", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("program the program", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("eat dinner", board.getDoneList().getTasks().get(0));
    }
}
