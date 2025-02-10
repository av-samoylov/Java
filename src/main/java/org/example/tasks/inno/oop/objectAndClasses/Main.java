package org.example.tasks.inno.oop.objectAndClasses;

import org.example.tasks.inno.oop.polimorfizm.*;
import org.example.tasks.inno.oop.polimorfizm.bird.Bird;
import org.example.tasks.inno.oop.polimorfizm.bird.Cuckoo;
import org.example.tasks.inno.oop.polimorfizm.bird.Parrot;
import org.example.tasks.inno.oop.polimorfizm.bird.Sparrow;
import org.example.tasks.inno.oop.polimorfizm.points2.Point2;
import org.example.tasks.inno.oop.polimorfizm.shape.Circle;
import org.example.tasks.inno.oop.polimorfizm.shape.Rectangle;
import org.example.tasks.inno.oop.polimorfizm.shape.Shape;
import org.example.tasks.inno.oop.polimorfizm.shape.Square;

import java.util.ArrayList;
import java.util.List;

import static org.example.tasks.inno.oop.polimorfizm.SumCalculator.sumAll;

public class Main {
    public static void main(String[] args) {
        // Создание точки с одной координатой и цветом
        Point2 point1 = new Point2.Builder()
                .setCoordinates(3)
                .setColor("красный")
                .build();

        // Создание точки с тремя координатами и временем появления
        Point2 point2 = new Point2.Builder()
                .setCoordinates(4, 2, 5)
                .setAppearanceTime("11:00")
                .build();

        // Создание точки с двумя координатами, временем и цветом
        Point2 point3 = new Point2.Builder()
                .setCoordinates(7, 7)
                .setAppearanceTime("15:35")
                .setColor("желтый")
                .build();

        // Вывод информации о точках
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
    }
}




















