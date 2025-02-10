package org.example.tasks.inno.oop.polimorfizm;

public class SumCalculator {
    public static double sumAll(double... numbers) {
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

//    public static void main(String[] args) {
//        // Выполнение заданных сложений
//        double result1 = sumAll(2, 3.0 / 4, 2.3); // 2 + 3/4 + 2.3
//        double result2 = sumAll(3.6, 49.0 / 12, 3, 3.0 / 2); // 3.6 + 49/12 + 3 + 3/2
//        double result3 = sumAll(1.0 / 3, 1); // 1/3 + 1
//
//        // Вывод результатов
//        System.out.println("Result 1: " + result1); // 5.05
//        System.out.println("Result 2: " + result2); // 10.25
//        System.out.println("Result 3: " + result3); // 1.333...
//    }
}
