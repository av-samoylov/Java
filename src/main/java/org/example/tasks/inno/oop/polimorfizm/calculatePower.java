package org.example.tasks.inno.oop.polimorfizm;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class calculatePower {
    public static double calculatePower(String x, String y) {
        int base = parseInt(x);
        int exponent = parseInt(y);
        return pow(base, exponent);
    }
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Пожалуйста, введите два числа.");
            return;
        }
        double result = calculatePower(args[0], args[1]);
        System.out.println("Результат: " + result);
    }
}
