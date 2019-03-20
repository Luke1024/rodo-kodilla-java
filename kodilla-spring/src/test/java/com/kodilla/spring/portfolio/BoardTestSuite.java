package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    private Board board;

    @Test
    public void testTaskAdd() {

        board.getToDoList().addTask("drink water");
        board.getInProgressList().addTask("program the program");
        board.getDoneList().addTask("eat dinner");

        Assert.assertEquals("drink water", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("program the program", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("eat dinner", board.getDoneList().getTasks().get(0));
    }
}
