package org.example.tasks.inno.oop.polimorfizm.shape;

import org.example.tasks.inno.oop.objectAndClasses.Point;

public class Square extends Shape{
    private Point topLeft;
    private  double sideLength;

    public Square(Point topLeft, double sideLength) {
        this.topLeft = topLeft;
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
