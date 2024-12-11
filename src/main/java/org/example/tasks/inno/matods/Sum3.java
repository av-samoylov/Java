package org.example.tasks.inno.matods;

public class Sum3{
    public static void main(String[] args) {
        System.out.println(sum3(5, 7, 2));
        System.out.println(sum3(8, -1, 4));
        System.out.println(sum3(5, 5, 10));
    }
    public static boolean sum3(int x, int y, int z) {
        if (x + y == z || x + z == y || y + z == x) return true;
        return false;
    }
}
