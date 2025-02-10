package org.example.tasks.inno.oop.polimorfizm;

import org.example.tasks.inno.oop.objectAndClasses.Point;
import org.example.tasks.inno.oop.objectAndClasses.PolyLine;

public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point... points) {
        super(points);

    }
    @Override
    public double getLength() {
        double sum = super.getLength();
        if (getPoints().size() > 1) {
            Point first = getPoints().get(0);
            Point last = getPoints().get(getPoints().size() - 1);
            sum += first.distanceTo(last);
        }
        return sum;
    }

    @Override
    public String toString() {
        return "ClosedPolyLine{" +
                "points=" + getPoints() +
                '}';
    }
//    public static void main(String[] args) {
//        ClosedPolyLine closedPolyLine = new ClosedPolyLine();
//        closedPolyLine.addPoint(new Point(0, 0));
//        closedPolyLine.addPoint(new Point(0, 3));
//        closedPolyLine.addPoint(new Point(4, 3));
//        closedPolyLine.addPoint(new Point(4, 0));
//
//        System.out.println(closedPolyLine); // Вывод информации о ClosedPolyLine
//        System.out.println("Length: " + closedPolyLine.getLength()); // Вывод длины замкнутой ломаной
//    }

}

/*
Реализация класса ClosedPolyLine
java
Копировать код
import java.util.List;

public class ClosedPolyLine extends PolyLine {

    // Конструкторы, использующие конструкторы родительского класса
    public ClosedPolyLine(Point... points) {
        super(points); // Передача точек в PolyLine
    }

    public ClosedPolyLine(List<Point> points) {
        super(points); // Передача точек в PolyLine
    }

    // Переопределение метода для расчета длины
    @Override
    public double getLength() {
        double baseLength = super.getLength(); // Длина обычной ломаной
        if (getPoints().size() > 1) {
            // Добавляем расстояние между первой и последней точками
            Point first = getPoints().get(0);
            Point last = getPoints().get(getPoints().size() - 1);
            baseLength += first.distanceTo(last);
        }
        return baseLength;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Замкнутая " + super.toString();
    }
}
Объяснение реализации
Наследование от PolyLine:

Мы используем весь функционал базового класса PolyLine, включая добавление точек, расчет длины и преобразование к строке.
Расчет длины:

Метод getLength в ClosedPolyLine вызывает getLength из базового класса PolyLine, чтобы вычислить длину обычной ломаной.
Затем добавляется длина от последней точки к первой, чтобы замкнуть линию.
Приведение к строке:

Метод toString переопределен, чтобы добавлять уточнение "Замкнутая".
Пример использования
java
Копировать код
public class Main {
    public static void main(String[] args) {
        // Создаем замкнутую ломаную линию
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(
                new Point(0, 0),
                new Point(4, 0),
                new Point(4, 3),
                new Point(0, 0) // Замыкаем линию
        );

        // Выводим строковое представление
        System.out.println(closedPolyLine);

        // Расчет длины
        System.out.println("Длина замкнутой ломаной: " + closedPolyLine.getLength());
    }
}
Вывод программы
mathematica
Копировать код
Замкнутая Линия [Point(0, 0), Point(4, 0), Point(4, 3), Point(0, 0)]
Длина замкнутой ломаной: 12.0
Преимущества подхода
Переиспользование кода:

Нет дублирования логики расчета длины обычной ломаной.
Используются уже существующие методы и конструкции базового класса.
Гибкость:

Новый класс расширяет функционал базового, добавляя минимальные изменения.
Простота поддержки:

Любые изменения в логике базового класса автоматически применяются к подклассу.
 */


/*

    public double length() {
        double totalLength = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalLength += points.get(i).distanceTo(points.get(i + 1));
        }
        return totalLength;
    }

    @Override
    public String toString() {
        return "PolyLine{" + "points=" + points + '}';
    }
}
Найти еще
Класс ClosedPolyLine
Теперь создадим класс ClosedPolyLine, который будет наследовать от PolyLine и переопределит метод length для учета замкнутости.
class ClosedPolyLine extends PolyLine {

    @Override
    public double length() {
        double totalLength = super.length(); // Длина обычной ломаной
        if (points.size() > 1) {
            // Добавляем длину от последней точки к первой
            totalLength += points.get(points.size() - 1).distanceTo(points.get(0));
        }
        return totalLength;
    }

    @Override
    public String toString() {
        return "ClosedPolyLine{" + "points=" + points + '}';
    }
}
Пример использования
Теперь создадим класс Main, чтобы продемонстрировать использование класса ClosedPolyLine.
public class Main {
    public static void main(String[] args) {
        ClosedPolyLine closedPolyLine = new ClosedPolyLine();
        closedPolyLine.addPoint(new Point(0, 0));
        closedPolyLine.addPoint(new Point(0, 3));
        closedPolyLine.addPoint(new Point(4, 3));
        closedPolyLine.addPoint(new Point(4, 0));

        System.out.println(closedPolyLine); // Вывод информации о ClosedPolyLine
        System.out.println("Length: " + closedPolyLine.length()); // Вывод длины замкнутой ломаной
    }
}

 */