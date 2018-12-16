package com.kodilla.testing.shape;

class Rectangle implements Shape
{
    double field;

    Rectangle(){
        this.field = 15.8;
    }
    public String getShapeName(){
        return this.getClass().getSimpleName();
    }
    public double getField(){
        return field;
    }
}