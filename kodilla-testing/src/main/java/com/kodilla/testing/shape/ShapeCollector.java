package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Iterator;


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


