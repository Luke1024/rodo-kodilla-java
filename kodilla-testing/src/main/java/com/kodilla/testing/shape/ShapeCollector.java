package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;

interface Shape{
    String getShapeName();
    double getField();
}

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

class Circle implements Shape
{
    double field;

    Circle(){
        this.field=25.4;
    }

    public String getShapeName(){
        return this.getClass().getSimpleName();
    }
    public double getField(){
        return field;
    }
}

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

public class ShapeCollector
{
    ArrayList<Shape> figures = new ArrayList();

    void addFigure(Shape shape){
        figures.add(shape);
    }
    void removeFigure(Shape shape){
        Iterator<Shape> itr = figures.iterator();
        while(itr.hasNext()) {
            Shape temp = itr.next();
            if (temp.getClass() == shape.getClass()) {
                itr.remove();
            }
        }
    }
    Shape getFigure(int n){
        return figures.get(n);
    }
    void showFigures(){
        for(Shape figure : figures){
            System.out.println(figure.getClass().getSimpleName());
        }
    }
}


