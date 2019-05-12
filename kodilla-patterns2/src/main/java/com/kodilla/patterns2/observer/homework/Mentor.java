package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }
    @Override
    public void update(Student student) {
        System.out.println("New task by " + student.getStudentName() + "\n" +
                " tasks queue size: " + student.getTasksQueue().size());
        updateCount++;
    }
    public int getUpdateCount() {
        return updateCount;
    }
}
