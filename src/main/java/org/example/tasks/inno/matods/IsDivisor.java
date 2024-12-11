package org.example.tasks.inno.matods;

public class IsDivisor {
    public static void main(String[] args) {
        System.out.println(isDivisor(3, 6));
        System.out.println(isDivisor(2, 15));
        System.out.println(isDivisor(3, 0));
    }
    public static boolean isDivisor(int a, int b) {
        return (a != 0 && b % a == 0) || (b != 0 && a % b == 0);
    }
}

