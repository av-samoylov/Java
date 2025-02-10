package org.example.tasks.inno.oop.polimorfizm;

import org.example.tasks.inno.oop.objectAndClasses.Point;

public class Point3D extends Point {
    int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }

    public static void main(String[] args) {
        Point point2D = new Point(1, 2);
        System.out.println(point2D); // Вывод: Point(1, 2)

        Point3D point3D = new Point3D(3, 4, 5);
        System.out.println(point3D); // Вывод: Point3D(3, 4, 5)

        // Вывод координат
        System.out.println("X: " + point3D.getX());
        System.out.println("Y: " + point3D.getY());
        System.out.println("Z: " + point3D.getZ());
    }
}
