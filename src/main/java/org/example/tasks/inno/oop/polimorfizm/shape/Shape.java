package org.example.tasks.inno.oop.polimorfizm.shape;

public abstract class Shape {
    public abstract double getArea();
}


/*
public abstract class Shape {
    public abstract double getArea();
}

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

public class Square extends Shape{
    private Point topLeft;
    private double sideLength;
    public Square(Point topLeft, double sideLength) {
        this.topLeft = topLeft;
        this.sideLength = sideLength;
    }
    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}

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

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, new Point(0, 0));
        Shape square = new Square(new Point(1, 1), 4);
        Shape rectangle = new Rectangle(new Point(2, 2), 3, 6);
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
    }
}
 */