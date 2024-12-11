package org.example.tasks.inno.matods;

public class IsPositive {
    public static void main(String[] args) {
        System.out.println(isPositive(3));
        System.out.println(isPositive(-5));
    }
    public static boolean isPositive(int x) {
        return x > 0;
    }
}

