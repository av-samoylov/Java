package org.example.tasks.inno.matods;

public class MainDecimals {
    public static void main(String[] args) {
        System.out.format("%.3f%n", (fraction(5.2)));
        System.out.format("%.3f%n", (fraction(8.987)));
        System.out.format("%.3f%n", (fraction(11.25309)));
    }

    public static double fraction(double x) {
        int y = (int) x;
        double z = x - y;
        return z;
    }
}
