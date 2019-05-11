package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Task implements Observable{
    private final List<Observer> observers;
    private final List<String> taskContent;
    private final String studentName;

    public Task(String studentName) {
        observers = new ArrayList<>();
        taskContent = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTaskContent(String content) {
        taskContent.add(content);
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public List<String> getTaskContent() {
        return taskContent;
    }
    public String getStudentName() {
        return studentName;
    }
}
