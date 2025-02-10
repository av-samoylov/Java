package org.example.tasks.inno.oop.polimorfizm.shape;

import org.example.tasks.inno.oop.objectAndClasses.Point;

public class Circle extends Shape {
    private double radius;
    public Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
