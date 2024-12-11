package org.example.tasks.inno.matods;

public class IsEqual {
    public static void main(String[] args) {
        System.out.println(isEqual(3, 3, 3));
        System.out.println(isEqual(2, 2, 1));
        System.out.println(isEqual(3, 2, 1));
    }
    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }
}

