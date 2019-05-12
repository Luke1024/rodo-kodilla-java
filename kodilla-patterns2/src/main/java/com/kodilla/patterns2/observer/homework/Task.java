package com.kodilla.patterns2.observer.homework;

public class Task {
    private final String taskName;
    private final String taskContent;

    public Task(String taskName, String taskContent) {
        this.taskName = taskName;
        this.taskContent = taskContent;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskContent() {
        return taskContent;
    }
}
