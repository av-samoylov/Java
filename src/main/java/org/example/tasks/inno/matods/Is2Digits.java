package org.example.tasks.inno.matods;

public class Is2Digits {
    public static void main(String[] args) {
        System.out.println(is2Digits(30));
        System.out.println(is2Digits(876));
    }
    public static boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }
}

