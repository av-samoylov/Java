package org.example.tasks.inno.oop.polimorfizm.shape;

import org.example.tasks.inno.oop.objectAndClasses.Point;

public class Rectangle extends Shape {
    private double width;
    private Point topLeft;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
