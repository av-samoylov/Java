package org.example.tasks.inno.matods;

public class Max {
    public static void main(String[] args) {
        System.out.println(max(5, 0));
        System.out.println(max(8, 4));
        System.out.println(max(9, 9));
    }
    public static int max(int x, int y) {
        if (x < y) return y;
        return x;
    }
}

