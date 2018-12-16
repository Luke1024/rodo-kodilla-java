package com.kodilla.testing.shape;

class Triangle implements Shape
{
    double field;

    Triangle(){
        this.field=12.6;
    }
    public String getShapeName(){
        return this.getClass().getSimpleName();
    }
    public double getField(){
        return field;
    }
}
