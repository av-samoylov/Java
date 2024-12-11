package org.example.tasks.inno.matods;

public class Is35 {
    public static void main(String[] args) {
        System.out.println(is35(5));
        System.out.println(is35(8));
        System.out.println(is35(15));
        System.out.println(is35(25));
    }

    public static boolean is35(int x) {
        if (x % 3 == 0 && !(x % 5 == 0) || x % 5 == 0 && !(x % 3 == 0)) return true;
        return false;
    }
}

