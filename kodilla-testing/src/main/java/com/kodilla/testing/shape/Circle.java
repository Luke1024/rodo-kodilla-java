package com.kodilla.testing.shape;

class Circle implements Shape
{
    double field;

    Circle(){
        this.field=25.4;
    }
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }
    public double getField(){
        return field;
    }
}
