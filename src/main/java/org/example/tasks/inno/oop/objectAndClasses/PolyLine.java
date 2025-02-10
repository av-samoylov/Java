package org.example.tasks.inno.oop.objectAndClasses;

import org.example.tasks.inno.oop.polimorfizm.Measurable;

import java.util.ArrayList;
import java.util.Arrays;

public class PolyLine implements Measurable {

        private final ArrayList<Point> points;

    public PolyLine(Point... points) {
        this.points = new ArrayList<>();
        for (Point point : points) {
            this.points.add(point);
        }
    }

    @Override
    public double getLength() {
        double sum = 0, len1, len2;
        for (int i = 0; i < points.size() - 1; i++) {
            len1 = points.get(i).getX() - points.get(i + 1).getX();
            len2 = points.get(i).getY() - points.get(i + 1).getY();
            sum += Math.sqrt(len1 * len1 + len2 * len2);
        }
        return sum;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void addPoint(Point point) {
        points.add(point);
    }


//    public Line[] getLines() {
//        Line[] lines = new Line[points.size() - 1];
//        for (int i = 0; i < points.size() - 1; i++) {
//            lines[i] = new Line(points.get(i), points.get(i + 1));
//        }
//        return lines;
//    }
//    public double getLength() {
//        double sum = 0, len1, len2;
//        for (int i = 0; i < points.size() - 1; i++) {
//            len1 = points.get(i).getX() - points.get(i + 1).getX();
//            len2 = points.get(i).getY() - points.get(i + 1).getY();
//            sum += Math.sqrt(len1 * len1 + len2 * len2);
//        }
//        return sum;
//    }

    @Override
    public String toString() {
        return "PolyLine{" +
                "points=" + points +
                '}';
    }

//    public static void main(String[] args) {
//        Point point1 = new Point(1, 5);
//        Point point2 = new Point(2, 8);
//        Point point3 = new Point(5, 3);
//        Point point4 = new Point(8, 9);
//
//        PolyLine polyLine = new PolyLine(new Point[]{point1, point2, point3, point4});
//        System.out.println(polyLine);
//        double polyLineLength = polyLine.getLength();
//        System.out.println("Длина ломаной: " + polyLineLength);
//
//        Line[] lines = polyLine.getLines();
//        System.out.println("Массив линий: " + Arrays.toString(lines));
//
//
//        double linesLength = 0;
//        for (Line line : lines) {
//            linesLength += line.getLength();
//        }
//        System.out.println("Длина масива линий: " + linesLength);
//
//        System.out.println("Длина ломаной и длина массива линий совпадают: " + (polyLineLength == linesLength));
//
//        point2.setX(12);
//        polyLine.addPoint(point2);
//        System.out.println("Изменённая ломаная: " + polyLine);
//    }

}

//---------------------------------------------------------------------------------------
//    public double getLength(){
//        double length = 0;
//        for (int i = 0; i < points.size() - 1; i++) {
//            length += new Line(points.get(i), points.get(i + 1)).getLength();
//        }
//        return length;
//  -------------------------------------------------------------------------------------------
//    Point[] points;
//
//    public PolyLine(Point... points) {
//        this.points = points;
//    }
//
//    public Point[] getPoints() {
//        return points;
//    }
//    public double getLength() {
//        double sum = 0, len1, len2;
//        for (int i = 0; i < points.length - 1; i++) {
//            len1 = points[i].getX() - points[i + 1].getX();
//            len2 = points[i].getY() - points[i + 1].getY();
//            sum += Math.sqrt(len1 * len1 + len2 * len2);
//        }
//        return sum;
//    }

//------------------------------------------------------------------------------------------

//    public PolyLine() {
//        points = new ArrayList<Point>();
//    }
/*
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 5);
        Point point2 = new Point(2, 8);
        Point point3 = new Point(5, 3);
        Point point4 = new Point(8, 9);

        PolyLine polyLine = new PolyLine(new Point[]{point1, point2, point3, point4});
        System.out.println(polyLine);
        double polyLineLength = polyLine.getLength();
        System.out.println("Длина ломаной: " + polyLineLength);

        Line[] lines = polyLine.getLines();
        System.out.println("Массив линий: " + Arrays.toString(lines));

        double linesLength = 0;
        for (int i = 0; i < lines.length; i++) {
            linesLength += lines[i].getLength();
        }
        System.out.println("Длина масива линий: " + linesLength);

        System.out.println("Длина ломаной и длина массива линий совпадают: " + (polyLineLength == linesLength));

        point2 = new Point(12, 8);
        polyLine.add(point2);
        System.out.println("Изменённая ломаная: " + polyLine);
    }
}
 */