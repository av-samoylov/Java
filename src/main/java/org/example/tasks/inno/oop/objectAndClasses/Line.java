package org.example.tasks.inno.oop.objectAndClasses;

import org.example.tasks.inno.oop.polimorfizm.Measurable;

public class Line implements Measurable {
   private final Point start;
   private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public double getLength() {
        return  start.distanceTo(end);
    }

//    public Line(int x1, int y1, int x2, int y2) {
//        this.start = new Point(x1, y1);
//        this.end = new Point(x2, y2);
//    }
//
//    public Point getStart() {
//        return start;
//    }
//
//    public void setStart(Point start) {
//        this.start = start;
//    }
//
//    public Point getEnd() {
//        return end;
//    }
//
//    public void setEnd(Point end) {
//        this.end = end;
//    }

//    public double getLength() {
//        int deltaX = end.getX() - start.getX();
//        int deltaY = end.getY() - start.getY();
//        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
//    }

    @Override
    public String toString() {
        return "Линия от {" + start.toString() + "} до {" + end.toString() + "}";
    }

//    public static void main(String[] args) {
//        Point point1 = new Point(1, 3);
//        Point point2 = new Point(5, 8);
//        Point point3 = new Point(10, 11);
//        Point point4 = new Point(15, 19);
//
//        Line line1 = new Line(point1, point2);
//        Line line2 = new Line(point3, point4);
//        Line line3 = new Line(point2, point3);
//        System.out.println("Линии 3 до изменения " + line3);
//
//        point2.setX(7);
//        point2.setY(10);
//        point3.setX(12);
//        point3.setY(15);
//        System.out.println("Линии 3 после изменения " + line3);
//
//        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
//        System.out.println("Общая длина всех линий: " + totalLength);
//    }
}

/*
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 3);
        Point point2 = new Point(5, 8);
        Point point3 = new Point(10, 11);
        Point point4 = new Point(15, 19);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point3, point4);
        Line line3 = new Line(point2, point3);

        System.out.println("Линии 3 до изменения " + line3);

        line3.getStartPoint().setX(3);
        line3.getStartPoint().setY(9);
        line3.getEndPoint().setX(17);
        line3.getEndPoint().setY(21);

        System.out.println("Линии 3 после изменения " + line3);

        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Общая длина всех линий: " + totalLength);
    }
}
 */

/*
public class Point {
    private int x;
    private int y;

    // Конструктор
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры и сеттеры
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}

public class Line {
    private Point start;
    private Point end;

    // Конструктор с двумя точками
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Конструктор с координатами
    public Line(int x1, int y1, int x2, int y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    // Геттеры и сеттеры
    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    // Рассчитать длину линии
    public double getLength() {
        int deltaX = end.getX() - start.getX();
        int deltaY = end.getY() - start.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString() {
        return "Линия от " + start + " до " + end;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание точек для линий
        Point point1 = new Point(1, 3);
        Point point2 = new Point(5, 8);
        Point point3 = new Point(10, 11);
        Point point4 = new Point(15, 19);

        // Создание линий
        Line line1 = new Line(point1, point2); // Линия 1
        Line line2 = new Line(point3, point4); // Линия 2
        Line line3 = new Line(point2, point3); // Линия 3

        // Вывод текстового представления Линии 3
        System.out.println("Линия 3: " + line3);

        // Изменение координат точек начала и конца Линии 3
        point2.setX(3);
        point2.setY(9);
        point3.setX(12);
        point3.setY(15);

        // Вывод текстового представления Линии 3 после изменения
        System.out.println("Линия 3 после изменения: " + line3);

        // Расчет суммарной длины всех линий
        double totalLength = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.printf("Суммарная длина всех линий: %.2f%n", totalLength);
    }
}

Линия 3: Линия от {5;8} до {10;11}
Линия 3 после изменения: Линия от {7;10} до {12;15}
Суммарная длина всех линий: 19.88

Объяснение:
Класс Point:

Описывает координаты точки и поддерживает их изменение через сеттеры.
Класс Line:

Может быть создан с помощью двух точек или координат начала и конца.
Вычисляет длину линии с использованием формулы расстояния между точками.
Имеет текстовое представление через метод toString.
Пример использования:

Создаются три линии, причем Линия 3 начинается в конце Линии 1 и заканчивается в начале Линии 2.
При изменении координат точек Линии 3 изменения автоматически отражаются на всех связанных объектах.
Вычисляется суммарная длина всех трех линий.
 */