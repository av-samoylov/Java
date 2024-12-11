package org.example.tasks.inno.matods;

public class SafeDiv {
    public static void main(String[] args) {
        System.out.println(safeDiv(5,0));
        System.out.println(safeDiv(8,4));
    }
    public static int safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        } else {
            return x / y;
        }
    }
}

