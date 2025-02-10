package org.example.tasks.inno.oop.polimorfizm;

import org.example.tasks.inno.oop.objectAndClasses.Line;
import org.example.tasks.inno.oop.objectAndClasses.Point;
import org.example.tasks.inno.oop.objectAndClasses.PolyLine;

import java.util.List;

public class LengthCalculator {
    public static double calculateLength(List<Measurable> measurablest) {
        double sum = 0;
        for (Measurable measurable : measurablest) {
            sum += measurable.getLength();
        }
        return sum;
    }

//    public static void main(String[] args) {
//        Line line = new Line(new Point(1, 2), new Point(3, 4));
//        PolyLine polyLine = new PolyLine(new Point[]{new Point(1, 2), new Point(3, 4), new Point(5, 6)});
//        ClosedPolyLine closedPolyLine = new ClosedPolyLine(
//                new Point(1, 2),
//                new Point(3, 4),
//                new Point(5, 6),
//                new Point(7, 8));
//        double sum = LengthCalculator.calculateLength(List.of(line, polyLine, closedPolyLine));
//        System.out.println("Sum of lengths: " + sum);
//    }
}
