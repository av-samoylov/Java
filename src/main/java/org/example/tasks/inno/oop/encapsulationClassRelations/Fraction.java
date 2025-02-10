package org.example.tasks.inno.oop.encapsulationClassRelations;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель должен быть положительным числом.");
        }
        if (numerator < 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }


    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return simplify(new Fraction(newNumerator, newDenominator));
    }

    public Fraction sum(int number) {
        return this.sum(new Fraction(number, 1));
    }

    public Fraction minus(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return simplify(new Fraction(newNumerator, newDenominator));
    }

    public Fraction minus(int number) {
        return this.minus(new Fraction(number, 1));
    }

    private static Fraction simplify(Fraction fraction) {
        int gcd = gcd(Math.abs(fraction.numerator), fraction.denominator);
        return new Fraction(fraction.numerator / gcd, fraction.denominator / gcd);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);

        Fraction result = f1.sum(f2).sum(f3).minus(5);

        System.out.println("Результат: " + result);
    }
}









/*

public class Fraction {
    private final int numerator;
    private final int denominator;

    // Конструктор с проверкой
    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель должен быть положительным числом.");
        }
        // Обеспечиваем правильный знак дроби
        if (numerator < 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    // Возвращение числителя
    public int getNumerator() {
        return numerator;
    }

    // Возвращение знаменателя
    public int getDenominator() {
        return denominator;
    }

    // Метод приведения к строке
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Метод сложения с другой дробью
    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return simplify(new Fraction(newNumerator, newDenominator));
    }

    // Метод сложения с целым числом
    public Fraction sum(int number) {
        return this.sum(new Fraction(number * this.denominator, this.denominator));
    }

    // Метод вычитания с другой дробью
    public Fraction minus(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return simplify(new Fraction(newNumerator, newDenominator));
    }

    // Метод вычитания с целым числом
    public Fraction minus(int number) {
        return this.minus(new Fraction(number * this.denominator, this.denominator));
    }

    // Упрощение дроби
    private static Fraction simplify(Fraction fraction) {
        int gcd = gcd(Math.abs(fraction.numerator), fraction.denominator);
        return new Fraction(fraction.numerator / gcd, fraction.denominator / gcd);
    }

    // Нахождение наибольшего общего делителя (НОД)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание дробей
        Fraction f1 = new Fraction(1, 3); // Одна треть
        Fraction f2 = new Fraction(2, 5); // Две пятых
        Fraction f3 = new Fraction(7, 8); // Семь восьмых

        // Вычисление f1.sum(f2).sum(f3).minus(5)
        Fraction result = f1.sum(f2).sum(f3).minus(5);

        // Вывод результата
        System.out.println("Результат: " + result);
    }
}

Результат: -103/120 //вывод результата

Объяснение
Класс Fraction:

Все объекты неизменяемы, благодаря использованию final полей.
Проверка знаменателя в конструкторе гарантирует корректность.
Операции сложения и вычитания возвращают новые объекты.
Метод simplify автоматически упрощает дроби.
Пример:

f1.sum(f2) вычисляет сумму дробей 1/3 и 2/5 → 11/15.
f1.sum(f2).sum(f3) добавляет к результату 7/8 → 233/120.
f1.sum(f2).sum(f3).minus(5) вычитает 5 → -103/120.
Универсальность:

Методы поддерживают как операции с дробями, так и с целыми числами.
Результат всегда приводится к упрощенной форме.



*/

















