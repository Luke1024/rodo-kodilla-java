package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LIST_NAME = "Awesome list";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LIST_NAME,"Too awesome to describe.");
        taskListDao.save(taskList);

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(LIST_NAME);

        //Then
        Assert.assertEquals(1, readTaskList.size());

        //CleanUp
        int id = taskList.getId();
        taskListDao.deleteById(id);
    }
}
