package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }
    @Override
    public void update(Task task) {
        System.out.println(mentorName + "New task by " + task.getStudentName() + "\n" +
                " tasks queue size: " + task.getTaskContent().size());
        updateCount++;
    }
    public int getUpdateCount() {
        return updateCount;
    }
}
