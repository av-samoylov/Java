package org.example.tasks.inno.matods;

public class Magic6{
    public static void main(String[] args) {
        System.out.println(magic6(5, 7));
        System.out.println(magic6(8, 2));
        System.out.println(magic6(1, 6));
        System.out.println(magic6(1, 7));
    }
    public static boolean magic6(int x, int y) {
        if (x == 6 || y == 6 || x + y == 6 || x - y == 6 || y - x == 6) return true;
        return false;
    }
}

