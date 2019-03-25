package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
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

        //When
        taskListDao.save(taskList);

        //Then
        List<TaskList> readTaskList = taskListDao.findByListName(LIST_NAME);

        //CleanUp
        int id = taskList.getId();
        taskListDao.deleteById(id);
    }
}
