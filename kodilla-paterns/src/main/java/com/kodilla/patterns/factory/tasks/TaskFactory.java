package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("driving to somewhere", "somewhere", "car");
            case PAINTING:
                return new PaintingTask("painting picture", "various", "landscape");
            case SHOPPING:
                return new ShoppingTask("sunday shopping", "clothes", 3);
            default:
                return null;
        }
    }
}