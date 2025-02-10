package org.example.tasks.inno.oop.objectAndClasses;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + "; " + y + "}";
    }

    public double distanceTo(Point last) {
        return 0;
    }
    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(1, 3);
        Point p3 = new Point(5, 8);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        boolean result1 = (p1 == p2);
        boolean result2 = (p1 == p3);
        System.out.println(result1);
        System.out.println(result2);
    }
}

/*
    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(1, 3);
        Point p3 = new Point(5, 8);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        boolean result1 = (p1 == p2);
        boolean result2 = (p1 == p3);
        System.out.println(result1);
        System.out.println(result2);
    }
 */
