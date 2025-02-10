package org.example.tasks.inno.oop.encapsulationClassRelations;

public class Square {
    private int x;
    private int y;
    private int sideLength;


    public Square(int x, int y, int sideLength) {

        this.x = x;
        this.y = y;
       privateSetSideLength(sideLength);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    private void privateSetSideLength(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны должна быть положительной.");
        }
        this.sideLength = sideLength;
    }

    public void setSideLength(int sideLength) {
       privateSetSideLength(sideLength);
    }


    @Override
    public String toString() {
        return "Квадрат в точке {" + x + ";" + y + "} со стороной " + sideLength;
    }

    public static void main(String[] args) {
        Square square = new Square(5, 10, 15);
        System.out.println(square);

        square.setX(10);
        square.setY(20);
        square.setSideLength(25);
        System.out.println(square);
    }
}



/*
public class Square {
    private int x; // Координата X верхнего левого угла
    private int y; // Координата Y верхнего левого угла
    private int sideLength; // Длина стороны квадрата

    // Конструктор
    public Square(int x, int y, int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны должна быть положительной.");
        }
        this.x = x;
        this.y = y;
        this.sideLength = sideLength;
    }

    // Геттеры
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSideLength() {
        return sideLength;
    }

    // Сеттеры с проверкой
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSideLength(int sideLength) {
        if (sideLength <= 0) {
            throw new IllegalArgumentException("Длина стороны должна быть положительной.");
        }
        this.sideLength = sideLength;
    }

    // Приведение к строке
    @Override
    public String toString() {
        return "Квадрат в точке {" + x + ";" + y + "} со стороной " + sideLength;
    }
}


public class Main {
    public static void main(String[] args) {
        // Создание квадрата
        Square square = new Square(5, 10, 15);

        // Вывод начального состояния квадрата
        System.out.println(square);

        // Изменение координат и длины стороны
        square.setX(10);
        square.setY(20);
        square.setSideLength(25);

        // Вывод измененного состояния квадрата
        System.out.println(square);
    }
}
Вывод программы
Копировать код
Квадрат в точке {5;10} со стороной 15
Квадрат в точке {10;20} со стороной 25


Объяснение реализации

1. Инкапсуляция:
Поля x, y и sideLength приватные, доступ к ним осуществляется через геттеры и сеттеры.
В сеттере для sideLength добавлена проверка на положительное значение.

2. Удобство использования:
Конструктор позволяет задать начальное состояние квадрата.
Методы setX, setY и setSideLength позволяют изменять состояние квадрата в любой момент.

3. Приведение к строке:
Метод toString возвращает удобочитаемую строку с текущим состоянием квадрата.

4. Гибкость:
Координаты x и y можно заменить классом Point, если будет использоваться его функциональность.
 */